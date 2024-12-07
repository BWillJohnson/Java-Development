package com.pluralsight.NorthwindTradersSpringBoot.impl;

import com.pluralsight.NorthwindTradersSpringBoot.Interface.IProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SimpleProductDao implements IProductDao {
    private List<Product> productList;

    public SimpleProductDao() {
       productList.add(new Product(1,"Latte",2,3.50));
       productList.add(new Product(2,"PBJ",1,1.75));
       productList.add(new Product(2, "Cappuccino", 2, 4.00));
       productList.add(new Product(3, "Espresso", 2, 2.50));
       productList.add(new Product(4, "Americano", 4, 3.00));
       productList.add(new Product(5, "Macchiato", 3, 3.75));
       productList.add(new Product(6, "Mocha", 2, 4.50));
    }

    @Override
    public Product add(Product product) {
        int maxProductId = 0;
        for (Product employee : productList) {
            if (employee.getProductId() > maxProductId){
                maxProductId = employee.getProductId();
            }
        }
        product.setProductId(maxProductId + 1);
        productList.add(product);
        return product;
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public Product getProductById(int productId) {
        for (Product employee : productList) {
            if (employee.getProductId() == productId){
                return employee;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(int productId, Product product) {
        int index = getProductIndex(productId);
        if (index != -1){
            productList.set(index,product);
        }
    }

    @Override
    public void deleteProduct(int productId) {
        int index = getProductIndex(productId);
        if (index != -1){
            productList.remove(index);
        }
    }

    private  int getProductIndex(int productId){
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId() == productId) {
                return i;
            }
        }
        return -1;
    }
}
