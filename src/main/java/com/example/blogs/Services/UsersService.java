package com.example.blogs.Services;

import com.example.blogs.Domain.DTOs.UsersDTO;
import com.example.blogs.Domain.Entity.Users;

import java.util.List;

public interface UsersService {

    UsersDTO createUser(Users user);
    UsersDTO findUserByID(long userId);
    void deleteUserById(long userId);

    List<UsersDTO> findALlUsers();
}
