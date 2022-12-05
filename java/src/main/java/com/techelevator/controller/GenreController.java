package com.techelevator.controller;

import com.techelevator.dao.GenreDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Genre;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
//
//Post - AddGenreListByEventId//


    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Genre createGenreListByEventId(@Valid @RequestBody GenreDao genreDao) {
        return genreDao.addGenreByEventId();
    }

}
