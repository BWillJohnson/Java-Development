package com.pluralsight.NorthwindTradersSpringBootModified.dao.interfaces;



import com.pluralsight.NorthwindTradersSpringBootModified.model.Product;

import java.util.List;

public interface IProductDao {
    Product insert(Product product);

    List<Product> getAll();

    Product getById(int productId);

    void update(int productId, Product product);

    void delete(int productId);
}