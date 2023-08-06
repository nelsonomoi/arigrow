package com.oumoi.arigrow.parameters.service;


import com.oumoi.arigrow.core.utils.ApiResponse;
import com.oumoi.arigrow.core.utils.PageableRequest;
import com.oumoi.arigrow.parameters.domain.dtos.ProductRequest;
import com.oumoi.arigrow.parameters.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ApiResponse fetchAllProducts(PageableRequest pageableRequest) {

        return ApiResponse.builder()
                .build();
    }

    public ApiResponse createProduct(ProductRequest productRequest) {

        return ApiResponse.builder().build();
    }
}
