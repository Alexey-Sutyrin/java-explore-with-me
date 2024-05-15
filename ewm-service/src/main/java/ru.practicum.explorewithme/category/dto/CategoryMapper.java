package ru.practicum.explorewithme.category.dto;

import ru.practicum.explorewithme.category.model.Category;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryMapper {

    public static Category toCategory(NewCategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        return category;
    }

    public static CategoryDto toCategoryDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public static List<CategoryDto> toDtos(List<Category> categories) {
        return categories.stream()
                .map(CategoryMapper::toCategoryDto)
                .collect(Collectors.toList());
    }
}
