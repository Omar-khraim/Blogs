package com.example.blogs.Controller;

import com.example.blogs.Domain.DTOs.UsersDTO;
import com.example.blogs.Services.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping("/findById/{userid}")
    public ResponseEntity<UsersDTO> findUserById(@PathVariable long userid ){
        if (userid <= 0 )
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(usersService.findUserByID(userid));

    }

    @GetMapping("/findAllUsers")
    public ResponseEntity<List<UsersDTO>> findAll(@PathVariable int page , @PathVariable int pageSize){
        return ResponseEntity.ok(usersService.findALlUsers());
    }

}
