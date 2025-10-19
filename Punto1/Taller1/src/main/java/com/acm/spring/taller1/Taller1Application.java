package com.acm.spring.taller1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

// Anotación que incluye @Configuration implícitamente
@SpringBootApplication
public class Taller1Application {

    public static void main(String[] args) { SpringApplication.run(Taller1Application.class, args);}

    @Bean("experimento1")
    public ExperimetService getExperimentService() { return new ExperimetService("Hi, I'm experiment 1"); }
    
}
