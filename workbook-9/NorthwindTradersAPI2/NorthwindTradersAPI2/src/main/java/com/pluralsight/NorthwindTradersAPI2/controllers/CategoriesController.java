package com.pluralsight.NorthwindTradersAPI2.controllers;

import com.pluralsight.NorthwindTradersAPI2.models.Category;
import com.pluralsight.NorthwindTradersAPI2.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {
        private List<Category> categoryList;

        public CategoriesController(){
            categoryList = new ArrayList<>();

            categoryList.add(new Category(101, "Electronics"));
            categoryList.add(new Category(102, "Electronics"));
            categoryList.add(new Category(103, "Electronics"));
            categoryList.add(new Category(104, "Accessories"));
            categoryList.add(new Category(105, "Accessories"));
            categoryList.add(new Category(106, "Electronics"));
            categoryList.add(new Category(107, "Accessories"));

        }
    @RequestMapping(path = "/categories",method = RequestMethod.GET)
    public List<Category>getCategoryListList(){
        return categoryList;
    }

        @RequestMapping(path = "/categories/{categoryId}",method = RequestMethod.GET)
        public Category getCategoryById(@PathVariable int categoryId){
            for (Category category : categoryList) {
                if (category.getCategoryId() == categoryId) {
                    return category;
                }
            }
            return null;  // if product with ID is not found!
        }
}
