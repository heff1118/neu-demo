package com.example.NEUDemo.config;

import com.example.NEUDemo.service.TODOService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public TODOService todoService(){
       return new TODOService();
    }
}
