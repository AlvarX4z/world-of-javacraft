package com.alvarx4z.woja.infrastructure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class OpenAPIConfiguration {

    @Value("${env.dev.url}")
    private String localhost;

    @Value("${spring.application.name}")
    private String appName;

    @Bean
    public OpenAPI openAPI() {
        Server devServer = new Server();
        devServer.setUrl(localhost);
        devServer.setDescription("Localhost URL for DEV environment");

        Contact contact = new Contact();
        contact.setName("Álvaro de Francisco Sánchez");
        contact.setUrl("https://www.linkedin.com/in/alvarodefranciscosanchez/");

        Info info = new Info()
            .title(appName)
            .contact(contact)
            .description("Documentation UI which provides all endpoints' information.");

        return new OpenAPI()
            .info(info)
            .servers(Collections.singletonList(devServer));
    }
}
