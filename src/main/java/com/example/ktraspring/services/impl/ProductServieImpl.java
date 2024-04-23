package com.example.ktraspring.services.impl;

import com.example.ktraspring.dao.ProductDAO;
import com.example.ktraspring.model.Product;
import com.example.ktraspring.response.PageResponse;
import com.example.ktraspring.response.impl.PageResponseImpl;
import com.example.ktraspring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServieImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;
    @Override
    public List<Product> getAllProducts() {
        return productDAO.getAll();
    }

    @Override
    public PageResponse<Product> getAllProduct(int page, int size) {
        return new PageResponseImpl<>(productDAO.getAll(), page, size);
    }
}
