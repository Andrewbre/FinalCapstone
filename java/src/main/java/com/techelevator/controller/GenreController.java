package com.techelevator.controller;

import com.techelevator.dao.GenreDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Genre;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")

public class GenreController {

    private GenreDao genreDao;

    public GenreController(GenreDao genreDao) {
        this.genreDao = genreDao;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/events/{id}", method = RequestMethod.POST)
    public List<Genre> createGenreListEventId(@Valid @RequestBody GenreDao genreDao) {
        List<Genre> songsList = new ArrayList<Genre>();
        return songsList;
    }

    @RequestMapping(path = "/api/events/genre/{id}", method = RequestMethod.GET)
    public List<Genre> getGenrefromEventId(){
        List<Genre> output = new ArrayList<Genre>();
        return output;
    }

    @RequestMapping(path = "/api/genre/{id}",method = RequestMethod.GET)
    public List<Genre> getGenrefromDjId(int djId) {
        List<Genre> output = new ArrayList<Genre>();
        return output;

    }

    @RequestMapping(path = "/api/events/genre", method = RequestMethod.GET)
    public List<Genre> getEveryGenres(){
        List<Genre> output = new ArrayList<Genre>();
        return output;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/api/events/{id}", method = RequestMethod.POST)
    public boolean addGenreFromEventId(@RequestBody GenreDao genreDao) {
        return false;
    }
}

//Get - GetallGenres
//Get - GetGenresByDjId
//Get - GetGenresByEventId
//Post - AddGenreListByEventId
