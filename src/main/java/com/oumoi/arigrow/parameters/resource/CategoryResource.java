package com.oumoi.arigrow.parameters.resource;


import com.oumoi.arigrow.core.utils.ApiResponse;
import com.oumoi.arigrow.parameters.domain.dtos.CategoryRequest;
import com.oumoi.arigrow.parameters.domain.entity.Category;
import com.oumoi.arigrow.parameters.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category")
@Slf4j
@RequiredArgsConstructor
public class CategoryResource {

    private final CategoryService categoryService;

    @GetMapping("")
    public ApiResponse fetchAllCategory(){
        return this.categoryService.fetchAllCategory();
    }

    @PostMapping("")
    public ApiResponse createCategory(@RequestBody CategoryRequest request){
        return this.categoryService.createCategory(request);
    }

    @PutMapping("/{id}")
    public ApiResponse updateCategory(@RequestBody CategoryRequest request, @PathVariable("id") Long categoryId){
        return this.categoryService.updateCategory(request,categoryId);
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteCategory(@PathVariable("id") Long categoryId){
        return this.categoryService.deleteCategory(categoryId);
    }

}
