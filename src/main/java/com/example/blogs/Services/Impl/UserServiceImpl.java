package com.example.blogs.Services.Impl;

import Util.ListMapper;
import com.example.blogs.Domain.DTOs.UsersDTO;
import com.example.blogs.Domain.Entity.Users;
import com.example.blogs.Repository.UsersRepo;
import com.example.blogs.Services.UsersService;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UsersService {


     /////////////
    /// Beans ///
   /////////////
    private final UsersRepo usersRepo;
    private ListMapper<Users, UsersDTO> listMapper;
    private ModelMapper modelMapper;

    public void setListMapper( ListMapper<Users, UsersDTO> listMapper){
        this.listMapper = listMapper;
    }

    public void setModelMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public UserServiceImpl(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

     ///////////////
    /// Methods ///
   ///////////////

    @Override
    public UsersDTO createUser(Users user) {
        return modelMapper.map(usersRepo.save(user) , UsersDTO.class);
    }

    @Override
    public UsersDTO findUserByID(long userId) {
        return modelMapper.map(usersRepo.findById(userId), UsersDTO.class);
    }

    @Override
    public void deleteUserById(long userId) {
        usersRepo.deleteById(userId);
    }

    @Override
    public List<UsersDTO> findALlUsers() {
        return (List<UsersDTO>) listMapper.mapList(usersRepo.findAll() , new UsersDTO()) ;
    }
}
