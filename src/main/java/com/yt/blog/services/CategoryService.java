package com.yt.blog.services;

import com.yt.blog.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto getCategoryById(Integer id);

    List<CategoryDto> getAllCategories();

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto, Integer id);

    void deleteCategory(Integer id);
}
