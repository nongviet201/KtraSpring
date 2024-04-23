package com.example.ktraspring.controller;


import com.example.ktraspring.dataBase.ProductDB;
import com.example.ktraspring.model.Product;
import com.example.ktraspring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Webcontroller {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String getProduct(Model model,
                            @RequestParam(required = false, defaultValue = "1") int page,
                            @RequestParam(required = false, defaultValue = "8") int pageSize) {
        model.addAttribute("pageData", productService.getAllProduct(page, pageSize));
        return "product";
    }

    @GetMapping("/product/get/detail/{id}")
    public String getProductDetail(Model model, @PathVariable int id) {
        Product product = ProductDB.products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("product", product);
        return "product-detail";
    }
}
