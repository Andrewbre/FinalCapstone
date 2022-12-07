package com.techelevator.controller;

import com.techelevator.dao.GenreDao;
import com.techelevator.model.Genre;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")

public class GenreController {

    private GenreDao genreDao;

    public GenreController(GenreDao genreDao) {
        this.genreDao = genreDao;
    }


<<<<<<< HEAD
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/events/{id}", method = RequestMethod.POST)
    public List<Genre> createGenreListEventId(@Valid @RequestBody GenreDao genreDao) {
        List<Genre> songsList = new ArrayList<Genre>();
        return songsList;
    }

    @RequestMapping(path = "/api/events/genre/{id}", method = RequestMethod.GET)
    public List<Genre> getGenreFromEventId(){
        List<Genre> output = new ArrayList<Genre>();
        return output;
    }

    @RequestMapping(path = "/api/genre/{id}",method = RequestMethod.GET)
    public List<Genre> getGenreFromDjId(int djId) {
        List<Genre> output = new ArrayList<Genre>();
        return output;
=======
    @RequestMapping(path = "/event_genre/{id}", method = RequestMethod.GET)
    public List<Genre> getGenresByEventId(@PathVariable int eventId) {
        return genreDao.getGenresByEventId(eventId);
    }

>>>>>>> fc773a436e08e0ae4690f1f1084bc2c85abe6010

    @RequestMapping(path = "/dj_genre/{id}",method = RequestMethod.GET)
    public List<Genre> getGenresByDjId(int djId) {
        return genreDao.getGenresByDjId(djId);
    }

}


//Get - GetGenresByDjId
//Get - GetGenresByEventId
