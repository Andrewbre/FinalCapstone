package com.techelevator.controller;

import com.techelevator.dao.GenreDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Genre;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.ArrayList;

@RestController
@CrossOrigin

public class GenreController {

    private GenreDao genreDao;

    public GenreController(GenreDao genreDao) {
        this.genreDao = genreDao;
    }
//Get - GetallGenres
//Get - GetGenresByDjId
//Get - GetGenresByEventId
//Post - AddGenreListByEventId


    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "", method = RequestMethod.POST)
    public List<Genre> createGenreListByEventId(@Valid @RequestBody GenreDao genreDao) {
        List<Genre> songsList = new ArrayList<Genre>();
        return songsList;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Genre> getGenreByEventId(){
        List<Genre> output = new ArrayList<Genre>();
        return output;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Genre> getGenreByDjId(){
        List<Genre> output = new ArrayList<Genre>();
        return output;

    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public Genre getAllGenres(){
        return genreDao.getAllGenres();
    }
}
