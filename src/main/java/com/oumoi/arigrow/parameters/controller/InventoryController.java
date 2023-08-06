package com.oumoi.arigrow.parameters.controller;


import com.oumoi.arigrow.parameters.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/inventory")
public class InventoryController {


    private final InventoryService inventoryService;
}
