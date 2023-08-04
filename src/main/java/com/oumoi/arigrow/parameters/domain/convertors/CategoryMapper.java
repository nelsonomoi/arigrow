package com.oumoi.arigrow.parameters.domain.convertors;


import com.oumoi.arigrow.parameters.domain.dtos.CategoryRequest;
import com.oumoi.arigrow.parameters.domain.dtos.CategoryResponse;
import com.oumoi.arigrow.parameters.domain.entity.Category;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryMapper {

    private final ModelMapper modelMapper;


    public Category categoryRequestToCategory(CategoryRequest categoryRequest){
        return this.modelMapper.map(categoryRequest, Category.class);
    }

    public CategoryResponse categoryToCategoryResponse(Category savedCategory) {
        return this.modelMapper.map(savedCategory,CategoryResponse.class);
    }

    public List<CategoryResponse>  categoryListTocategoryResponseList(List<Category> categoryList){
        return categoryList.stream()
                .map(category -> this.modelMapper.map(category,CategoryResponse.class))
                .toList();
    }

    public Category categoryRequestToCategory(CategoryRequest categoryRequest, Category category){
        category.setName(categoryRequest.getName());
        category.setDescription(categoryRequest.getDescription());
        return category;
    }
}
