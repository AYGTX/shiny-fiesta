package com.gameamq.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gameamq.dto.MessageStorage;

@Configuration
class BeanConfiguration {

    @Bean
    public MessageStorage customerStorage() {
        return new MessageStorage();
    }
}