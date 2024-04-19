package com.sbs.product.service;

import com.sbs.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);

    Product updateProduct(Product product);

    Optional<Product> getProduct(String id);

    void deleteProduct(String id);

    List<Product> getAllProduct();

}
