package com.ps34441.E_commerce.service;

import com.ps34441.E_commerce.entity.Product;
import com.ps34441.E_commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Service method to find products by category ID
    public List<Product> findByCategoryId(Integer cid) {
        return productRepository.findByCategoryId(cid);
    }
}


