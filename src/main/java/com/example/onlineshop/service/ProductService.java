package com.example.onlineshop.service;

import com.example.onlineshop.dto.ProductDTO;

import java.util.List;


public interface ProductService {
    List<ProductDTO> getAll();
    void addToUserBucket(Long productId, String username);
    }

