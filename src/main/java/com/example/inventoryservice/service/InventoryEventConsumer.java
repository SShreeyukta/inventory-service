package com.example.inventoryservice.service;

import com.example.inventoryservice.dto.OrderCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryEventConsumer {

    @KafkaListener(
            topics = "order-events",
            groupId = "inventory-service"
    )

    public void handleOrderCreated(OrderCreatedEvent event){

        System.out.println("Inventory Event received");
        System.out.println("Inventory service received order " + event.getOrderId());
        System.out.println("Reserving inventory for " + event.getQuantity() + " products of " + event.getProductId());

    }
}
