package com.techelevator.controller;

import com.techelevator.dao.UserDao;
import com.techelevator.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")


public class UserController {
    private UserDao userDao;


    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public List<User> findEvery(){
        List<User> output = new ArrayList();
        return output;
    }
    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public User getUserBySingleId(int userId){
        return userDao.getUserById(userId);
    }

    @RequestMapping(path = "/user/{userName}", method = RequestMethod.GET)
    public User findByUsersName(@PathVariable String userName){
        return userDao.findByUsername(userName);

    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/user ", method = RequestMethod.POST)
    public boolean createNew(String username, String password, String role) {
        return userDao.create(username, password, role);
    }
}
