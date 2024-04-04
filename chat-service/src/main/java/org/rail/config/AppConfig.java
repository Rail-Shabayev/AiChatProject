package org.rail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class AppConfig {

    @Bean
    RestClient restClient() {
        return RestClient.builder()
                .baseUrl("http://localhost:11434/api/generate")
                .build();
    }
}
