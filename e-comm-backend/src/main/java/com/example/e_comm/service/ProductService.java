package com.example.e_comm.service;

import com.example.e_comm.model.Product;
import com.example.e_comm.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo prepo;

    public List<Product> getAllProducts() {
        return prepo.findAll();
    }

    public Product getProductById(int id){
        return prepo.findById(id).orElse(null);
    }
}
