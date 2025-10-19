package com.spring.taller1.taller1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    
    private OrderService orderService;

    public InventoryService() {
       
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
        System.out.println("Dependencia OrderService inyectada en InventoryService");
    }
}
