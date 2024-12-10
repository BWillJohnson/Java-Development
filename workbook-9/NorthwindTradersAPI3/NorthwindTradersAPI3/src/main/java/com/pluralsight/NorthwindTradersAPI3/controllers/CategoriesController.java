package com.pluralsight.NorthwindTradersAPI3.controllers;

import com.pluralsight.NorthwindTradersAPI3.dao.interfaces.ICategory;
import com.pluralsight.NorthwindTradersAPI3.models.Category;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
