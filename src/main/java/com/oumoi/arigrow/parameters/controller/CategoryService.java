package com.oumoi.arigrow.parameters.controller;


import com.oumoi.arigrow.core.utils.ApiResponse;
import com.oumoi.arigrow.exceptions.ResourceNotFoundException;
import com.oumoi.arigrow.parameters.domain.convertors.CategoryMapper;
import com.oumoi.arigrow.parameters.domain.dtos.CategoryRequest;
import com.oumoi.arigrow.parameters.domain.entity.Category;
import com.oumoi.arigrow.parameters.domain.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oumoi.arigrow.utils.MessageConstants.SUCCESS_MESSAGE;
import static com.oumoi.arigrow.utils.MessageConstants.SUCCESS_STATUS;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;

    public ApiResponse fetchAllCategory() {
        List<Category> categoryList = this.categoryRepository.findAll();
        return ApiResponse.builder()
                .status(SUCCESS_STATUS)
                .statusCode(HttpStatus.OK.value())
                .message(SUCCESS_MESSAGE)
                .payLoad(this.categoryMapper.categoryListTocategoryResponseList(categoryList))
                .build();
    }

    public ApiResponse createCategory(CategoryRequest request) {
        Category category = this.categoryMapper.categoryRequestToCategory(request);

        Category savedCategory = this.categoryRepository.save(category);

        return ApiResponse.builder()
                .status(SUCCESS_STATUS)
                .statusCode(HttpStatus.OK.value())
                .message(SUCCESS_MESSAGE)
                .payLoad(this.categoryMapper.categoryToCategoryResponse(savedCategory))
                .build();
    }

    public ApiResponse updateCategory(CategoryRequest request, Long categoryId) {

        Category existingCategory = this.categoryRepository.findCategoryById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found."));

        Category category = this.categoryMapper.categoryRequestToCategory(request,existingCategory);

        Category updatedCategory = this.categoryRepository.save(category);

        return ApiResponse.builder()
                .status(SUCCESS_STATUS)
                .statusCode(HttpStatus.OK.value())
                .message(SUCCESS_MESSAGE)
                .payLoad(this.categoryMapper.categoryToCategoryResponse(updatedCategory))
                .build();
    }

    public ApiResponse deleteCategory(Long categoryId){
        Category category = this.categoryRepository.findCategoryById(categoryId).orElseThrow(() ->
                new ResourceNotFoundException("Category not found"));

        this.categoryRepository.delete(category);

        return ApiResponse.builder()
                .status(SUCCESS_STATUS)
                .statusCode(HttpStatus.OK.value())
                .message(SUCCESS_MESSAGE)
                .build();
    }
}
