package com.example.ktraspring.ultils;

import java.util.List;

import com.example.ktraspring.model.Product;
public interface IFileReader {
    List<Product> readFile(String path);
}
