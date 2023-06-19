package com.example.onlineshop.service;

import com.example.onlineshop.domain.User;
import com.example.onlineshop.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService { // security

    boolean save(UserDTO userDTO);

}
