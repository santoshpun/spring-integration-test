package com.santosh.integrationtest.service;

import com.santosh.integrationtest.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProducts();
}
