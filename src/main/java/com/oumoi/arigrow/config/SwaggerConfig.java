package com.oumoi.arigrow.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI rafikiBackendOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("Arigrow Documentation")
                        .description("Api documentation for the arigrow system.")
                        .version("1.0.0")
                );
    }

    @Bean
    public GroupedOpenApi publicApi(){
        String[] paths = {"/api/**"};

        return GroupedOpenApi.builder()
                .group("public-api")
                .pathsToMatch(paths)
                .build();
    }
}
