package com.example.e_comm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @Column(name = "RELEASE_DATE")
    private Date releaseDate;
    @Column(name="PRODUCT_AVAILABLE")
    private boolean productAvailable;
    @Column(name="STOCK_QUANTITY")
    private int stockQuantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
