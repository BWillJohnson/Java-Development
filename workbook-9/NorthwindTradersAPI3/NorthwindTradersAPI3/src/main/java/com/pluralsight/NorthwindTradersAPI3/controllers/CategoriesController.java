package com.pluralsight.NorthwindTradersAPI3.controllers;

import com.pluralsight.NorthwindTradersAPI3.dao.interfaces.ICategory;
import com.pluralsight.NorthwindTradersAPI3.models.Category;
import com.pluralsight.NorthwindTradersAPI3.models.Product;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesController {
    private final ICategory CategoryDao;
    @Autowired
    public CategoriesController(ICategory jdbcCategoryDao) {
        CategoryDao = jdbcCategoryDao;
    }

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategory(){
        return CategoryDao.getAllCategory();
    }

    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.GET)
    public Category getCategoriesById(@PathVariable int categoryId){
        return CategoryDao.getCategoriesById(categoryId);
    }

    @RequestMapping(path = "/categories", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Category insertCategory(@RequestBody Category category) {
        return CategoryDao.insertCategory(category);
    }
    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.PUT)
    public void updateCategory(@PathVariable int categoryId,@RequestBody Category category) {
        CategoryDao.updateCategory(categoryId,category);
    }
}
