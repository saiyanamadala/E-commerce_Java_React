package com.example.e_comm.controller;

import com.example.e_comm.model.Product;
import com.example.e_comm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService pserv;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return pserv.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return pserv.getProductById(id);
    }
}
