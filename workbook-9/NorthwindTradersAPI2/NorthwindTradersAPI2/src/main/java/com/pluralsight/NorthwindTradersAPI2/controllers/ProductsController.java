package com.pluralsight.NorthwindTradersAPI2.controllers;

import com.pluralsight.NorthwindTradersAPI2.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    private List<Product>productList;

    public ProductsController(){
        productList = new ArrayList<>();

        productList.add(new Product(1, "Laptop", 101, 799.99));
        productList.add(new Product(2, "Smartphone", 102, 599.49));
        productList.add(new Product(3, "Tablet", 103, 399.99));
        productList.add(new Product(4, "Headphones", 104, 129.99));
        productList.add(new Product(5, "Smartwatch", 105, 249.99));
        productList.add(new Product(6, "Monitor", 106, 299.49));
        productList.add(new Product(7, "Keyboard", 107, 49.99));
    }
    @RequestMapping(path = "/products",method = RequestMethod.GET)
    public List<Product>getProductList(){
        return productList;
    }
    @RequestMapping(path = "/products/{productId}",method = RequestMethod.GET)
    public Product getProductById(@PathVariable int productId){
        for (Product product : productList) {
            if (product.getProductId() == productId){
                return product;
            }
        }
        return null;  // if product with ID is not found!
    }
}
