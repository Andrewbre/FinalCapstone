package com.techelevator.dao;

import com.techelevator.model.User;

import java.util.List;

public interface UserDao {



    User getUserById(int userId);

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password, String role);

    List<User> findAll();

    List<User> findAllHosts();

    public List<User> findAllDjs();
}
