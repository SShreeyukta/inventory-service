package com.example.inventoryservice.model;

public class Inventory {

    private String productId;
    private int availableQty;

    public Inventory(String productId, int availableQty) {
        this.productId = productId;
        this.availableQty = availableQty;
    }

    public String getProductId() {
        return productId;
    }

    public int getAvailableQty() {
        return availableQty;
    }
}
