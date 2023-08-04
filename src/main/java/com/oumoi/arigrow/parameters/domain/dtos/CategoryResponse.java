package com.oumoi.arigrow.parameters.domain.dtos;


import lombok.Data;

@Data
public class CategoryResponse {
    private Long categoryId;

    private String name;

    private String description;
}
