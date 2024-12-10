package com.pluralsight.NorthwindTradersAPI3.dao.interfaces;

import com.pluralsight.NorthwindTradersAPI3.models.Category;
import com.pluralsight.NorthwindTradersAPI3.models.Product;

import java.util.List;

public interface ICategory {
    List<Category> getAllCategory();

    Category getCategoriesById(int categoryId);
}
