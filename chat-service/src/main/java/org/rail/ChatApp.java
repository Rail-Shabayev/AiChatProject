package org.rail;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(description = "third project"))
public class ChatApp {
    public static void main(String[] args) {
        SpringApplication.run(ChatApp.class);
    }
}