package com.example.onlineshop.controllers;

import com.example.onlineshop.dto.BucketDTO;
import com.example.onlineshop.service.BucketService;
import com.example.onlineshop.service.UserService;
import lombok.val;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class BucketController {
    private final BucketService bucketService;
    private final UserService userService;


    public BucketController(BucketService bucketService, UserService userService) {
        this.bucketService = bucketService;
        this.userService = userService;
    }
    @GetMapping("/bucket")
    public String aboutBucket(Model model, Principal principal){
        if (principal==null){
            model.addAttribute(" bucket", new BucketDTO());
        }
        else {
            BucketDTO bucketDTO = bucketService.getBucketUser(principal.getName());
            model.addAttribute("bucket", bucketDTO);
        }
        return "bucket";
    }
    @PostMapping("/bucket/remove/{productId}")
    public String removeProductFromBucket(@PathVariable("productId") Long productId, Principal principal) {
        if (principal != null) {
            val user = userService.findByName(principal.getName());
            if (user != null && user.getBucket() != null) {
                bucketService.removeProduct(user.getBucket(), productId);
            }
        }
        return "redirect:/bucket";
    }
}
