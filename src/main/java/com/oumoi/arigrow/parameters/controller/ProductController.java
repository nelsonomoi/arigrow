package com.oumoi.arigrow.parameters.controller;


import com.oumoi.arigrow.core.utils.ApiResponse;
import com.oumoi.arigrow.core.utils.PageableRequest;
import com.oumoi.arigrow.parameters.domain.dtos.ProductRequest;
import com.oumoi.arigrow.parameters.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;


    @GetMapping("")
    public ApiResponse fetchProducts(@RequestParam PageableRequest pageableRequest){
        return this.productService.fetchAllProducts(pageableRequest);
    }

    @PostMapping("")
    public ApiResponse createProduct(@RequestBody ProductRequest productRequest){
        return this.productService.createProduct(productRequest);
    }
}
