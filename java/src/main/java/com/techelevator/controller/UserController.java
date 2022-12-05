package com.techelevator.controller;


import com.techelevator.dao.UserDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class UserController {
    private UserDao userDao;


    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }
}
