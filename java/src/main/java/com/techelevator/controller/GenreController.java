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

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
@RequestMapping("/api/")
public class GenreController {

    private GenreDao genreDao;

    public GenreController(GenreDao genreDao) {
        this.genreDao = genreDao;
    }


    @ResponseStatus(HttpStatus.CREATED)
<<<<<<< HEAD
    @RequestMapping(path = "/api/events/{id}", method = RequestMethod.POST)
    public List<Genre> createGenreListByEventId(@Valid @RequestBody GenreDao genreDao) {
        List<Genre> songsList = new ArrayList<Genre>();
        return songsList;
    }

    @RequestMapping(path = "/api/events/genre/{id}", method = RequestMethod.GET)
    public List<Genre> getGenreByEventId(){
        List<Genre> output = new ArrayList<Genre>();
        return output;
    }

    @RequestMapping(path = "/api/genre/{id}",method = RequestMethod.GET)
    public List<Genre> getGenreByDjId(int djId){
        List<Genre> output = new ArrayList<Genre>();
        return output;

=======
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Genre createGenreListByEventId(@Valid @RequestBody GenreDao genreDao) {
        //return genreDao.addGenreByEventId();
    return null;
>>>>>>> f61d274e57669090eec8e88567fbba22c6a7c9f6
    }

    @RequestMapping(path = "/api/events/genre", method = RequestMethod.GET)
    public List<Genre> getAllGenres(){
        List<Genre> output = new ArrayList<Genre>();
        return output;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/api/events/{id}", method = RequestMethod.POST)
    public boolean addGenreByEventId(@RequestBody GenreDao genreDao) {
        return false;
    }
}

//Get - GetallGenres
//Get - GetGenresByDjId
//Get - GetGenresByEventId
//Post - AddGenreListByEventId
