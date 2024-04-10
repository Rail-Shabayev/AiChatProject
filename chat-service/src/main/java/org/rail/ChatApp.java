package org.rail;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.rail.model.Request;
import org.rail.model.Response;
import org.rail.repository.RequestRepository;
import org.rail.repository.ResponseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.UUID;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(description = "third project"))
public class ChatApp {
    public static void main(String[] args) {
        SpringApplication.run(ChatApp.class);
    }

    @Bean
    CommandLineRunner commandLineRunner(RequestRepository requestRepository, ResponseRepository responseRepository) {
        return args -> {
            Response response1 = new Response(1L, LocalDateTime.now(), "the", true);
            responseRepository.save(response1);
            requestRepository.save(new Request(UUID.randomUUID(), "llama2", "what is", true, false, response1));
        };
    }
}