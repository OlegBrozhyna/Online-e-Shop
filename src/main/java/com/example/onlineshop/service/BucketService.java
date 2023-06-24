package com.example.onlineshop.service;

import com.example.onlineshop.domain.Bucket;
import com.example.onlineshop.domain.User;
import com.example.onlineshop.dto.BucketDTO;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);
    void  addProducts(Bucket bucket, List<Long> productIds);

    BucketDTO getBucketUser(String name);

    void removeProduct(Bucket bucket, Long productId);
}
