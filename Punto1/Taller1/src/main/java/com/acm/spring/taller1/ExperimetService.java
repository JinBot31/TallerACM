package com.acm.spring.taller1;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ExperimetService {

    public ExperimetService() {
        System.out.println("Hello from ExperimetService");
    }

    public ExperimetService(String message) {
        System.out.println(message);
    }

}
