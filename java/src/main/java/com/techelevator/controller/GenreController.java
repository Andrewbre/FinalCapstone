package com.techelevator.controller;

import com.techelevator.dao.GenreDao;
import com.techelevator.model.Genre;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin

public class GenreController {

    private GenreDao genreDao;

    public GenreController(GenreDao genreDao) {
        this.genreDao = genreDao;
    }


    @RequestMapping(path = "/event_genre/{eventId}", method = RequestMethod.GET)
    public List<Genre> getGenresByEventId(@PathVariable int eventId) {
        return genreDao.getGenresByEventId(eventId);
    }


    @RequestMapping(path = "/dj_genre/{djId}", method = RequestMethod.GET)
    public List<Genre> getGenresByDjId(@PathVariable int djId) {
        return genreDao.getGenresByDjId(djId);
    }

    @RequestMapping(path = "/genre/{genreId}", method = RequestMethod.GET)
    public Genre getGenreByGenreId(@PathVariable int genreId){
        return genreDao.getGenresByGenreId(genreId);
    }

}



