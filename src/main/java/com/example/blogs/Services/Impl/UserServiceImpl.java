package com.example.blogs.Services.Impl;

import com.example.blogs.Domain.DTOs.UsersDTO;
import com.example.blogs.Domain.Entity.Users;
import com.example.blogs.Services.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UsersService {
    @Override
    public UsersDTO createUser(Users user) {
        return null;
    }

    @Override
    public UsersDTO findUserByID(long userId) {
        return null;
    }

    @Override
    public void deleteUserById(long userId) {

    }
}
