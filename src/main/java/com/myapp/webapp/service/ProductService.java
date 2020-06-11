package com.myapp.webapp.service;

import java.util.List;

import com.myapp.webapp.models.Product;


public interface ProductService {



    Product getProductById (int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

	List<Product> getProductList();

	


}
