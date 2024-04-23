package com.example.ktraspring.dao.impl;

import com.example.ktraspring.dao.ProductDAO;
import com.example.ktraspring.dataBase.ProductDB;
import com.example.ktraspring.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductDAOImpl implements ProductDAO {

    @Override
    public List<Product> getAll() {
        return ProductDB.products;
    }
}
