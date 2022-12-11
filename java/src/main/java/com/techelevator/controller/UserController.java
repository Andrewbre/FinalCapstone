package com.techelevator.controller;

import com.techelevator.dao.UserDao;
import com.techelevator.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")


public class UserController {
    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(path = "/host", method = RequestMethod.GET)
    public List<User> findEveryHost(List<User> allHosts){
        return userDao.findAllHosts();
    }
    @RequestMapping(path = "/dj", method = RequestMethod.GET)
    public List<User> findEveryDj(List<User> allDjs){
        return userDao.findAllDjs();
    }

    @RequestMapping(path="/dj/{djId}", method = RequestMethod.GET)
    public User findDjByUserId(@PathVariable int djId){
        return userDao.getUserById(djId);
    }
    //findHostByHost
    @RequestMapping(path="/host/{hostId}", method = RequestMethod.GET)
    public User findHostByUserId(@PathVariable int hostId){
        return  userDao.getUserById(hostId);
    }

    @RequestMapping(path = "/user/{userId}", method = RequestMethod.GET)
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
