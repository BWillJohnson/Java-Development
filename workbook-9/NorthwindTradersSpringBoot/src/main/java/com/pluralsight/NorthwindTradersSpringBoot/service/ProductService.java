package com.pluralsight.NorthwindTradersSpringBoot.service;

import com.pluralsight.NorthwindTradersSpringBoot.Interface.IProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private IProductDao productDao;

    @Autowired
    public ProductService(IProductDao productDao) {
        this.productDao = productDao;
    }

    public Product addProduct(Product product){
        return productDao.add(product);
    }


    public List<Product> getAllProducts() {
        return productDao.getAll();
    }

    public Product getProductById(int productId){
        return productDao.getProductById(productId);
    }

    public void updateProduct(int productId, Product product) {
        productDao.updateProduct(productId, product);
    }
    public void deleteProduct(int productId) {
        productDao.deleteProduct(productId);
    }


}
