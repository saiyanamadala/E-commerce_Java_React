package com.example.e_comm.service;

import com.example.e_comm.model.Product;
import com.example.e_comm.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());

        return prepo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageData(imageFile.getBytes());
        product.setName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());

        return prepo.save(product);
    }
}
