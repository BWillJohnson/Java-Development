package com.pluralsight.NorthwindTradersSpringBoot.Interface;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;

import java.util.List;

public interface IProductDao {
   Product add(Product product);

   List<Product> getAll();

   Product getProductById(int productId);

   void updateProduct(int productId, Product product);

   void deleteProduct(int productId);
}
