package com.example.e_comm.service;

import com.example.e_comm.model.Product;
import com.example.e_comm.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo prepo;

    public List<Product> getAllProducts() {
        return prepo.findAll();
    }
}