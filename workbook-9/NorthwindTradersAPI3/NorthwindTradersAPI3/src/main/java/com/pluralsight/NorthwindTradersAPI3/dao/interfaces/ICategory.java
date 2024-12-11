package com.pluralsight.NorthwindTradersAPI3.dao.interfaces;

import com.pluralsight.NorthwindTradersAPI3.models.Category;

import java.util.List;

public interface ICategory {
    List<Category> getAllCategory();

    Category getCategoriesById(int categoryId);

    Category insertCategory(Category category);

    void update(int categoryId, Category category);

    void delete(int categoryId);
}
