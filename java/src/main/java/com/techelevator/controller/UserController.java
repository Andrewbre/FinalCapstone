package com.techelevator.controller;
import com.techelevator.dao.UserDao;
import com.techelevator.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.util.RouteMatcher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin

public class UserController {
    private UserDao userDao;


    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<User> findAll(){
        List<User> output = new ArrayList();
        return output;
    }
    @RequestMapping(path = "", method = RequestMethod.GET)
    public User getUserById(int userId){
        return userDao.getUserById(userId);
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public User findByUserName(String userName){
        return userDao.findByUsername(userName);

    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "", method = RequestMethod.POST)
    public boolean create(String username, String password, String role) {
        return userDao.create(username, password, role);
    }
}
