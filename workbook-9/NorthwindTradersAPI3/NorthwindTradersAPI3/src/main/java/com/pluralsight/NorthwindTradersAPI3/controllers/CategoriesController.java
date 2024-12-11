package com.pluralsight.NorthwindTradersAPI3.controllers;

import com.pluralsight.NorthwindTradersAPI3.dao.interfaces.ICategory;
import com.pluralsight.NorthwindTradersAPI3.models.Category;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesController {
    private final ICategory JdbcCategoryDao;
    @Autowired
    public CategoriesController(ICategory jdbcCategoryDao) {
        JdbcCategoryDao = jdbcCategoryDao;
    }

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategory(){
        return JdbcCategoryDao.getAllCategory();
    }

    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.GET)
    public Category getCategoriesById(@PathVariable int categoryId){
        return JdbcCategoryDao.getCategoriesById(categoryId);
    }

    @RequestMapping(path = "/categories", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Category insertCategory(@RequestBody Category category) {
        return JdbcCategoryDao.insertCategory(category);
    }
}
