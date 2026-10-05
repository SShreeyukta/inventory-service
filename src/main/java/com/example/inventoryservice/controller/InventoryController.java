package com.example.inventoryservice.controller;

import com.example.inventoryservice.model.Inventory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping
    @RequestMapping("/{productId}")
    public Inventory getInventory(@PathVariable String productId){
        return new Inventory(productId, 100);
    }
}
