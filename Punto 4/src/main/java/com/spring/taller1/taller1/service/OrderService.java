package com.spring.taller1.taller1.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final InventoryService inventoryService;

    public OrderService(@Lazy InventoryService inventoryService) {
        this.inventoryService = inventoryService;
        System.out.println("OrderService inicializado");
    }

}