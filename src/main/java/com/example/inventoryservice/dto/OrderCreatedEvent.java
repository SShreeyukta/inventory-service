package com.example.inventoryservice.dto;

public class OrderCreatedEvent {

    private Long orderId;
    private String productId;
    private int quantity;

    public OrderCreatedEvent() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
