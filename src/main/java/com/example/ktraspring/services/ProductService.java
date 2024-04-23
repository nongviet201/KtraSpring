package com.example.ktraspring.services;

import com.example.ktraspring.model.Product;
import com.example.ktraspring.response.PageResponse;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    PageResponse<Product> getAllProduct(int page, int size);
}
