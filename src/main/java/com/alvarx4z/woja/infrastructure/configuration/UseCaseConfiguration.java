package com.alvarx4z.woja.infrastructure.configuration;

import com.alvarx4z.woja.application.GetAllExpansionsUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public GetAllExpansionsUseCase getAllExpansionsUseCase() {
        return new GetAllExpansionsUseCase();
    }
}
