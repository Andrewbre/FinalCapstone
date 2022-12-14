package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.GenreDao;
import com.techelevator.dao.SongsDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.User;
import com.techelevator.model.spotify.Root;
import com.techelevator.services.SpotifyService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpotifyServiceController {
    private EventDao eventDao;
    private GenreDao genreDao;
    private SongsDao songsDao;
    private UserDao userDao;
    private SpotifyService spotifyService;

    public SpotifyServiceController(EventDao eventDao, GenreDao genreDao, SongsDao songsDao, UserDao userDao, SpotifyService spotifyService){
        this.eventDao = eventDao;
        this.genreDao = genreDao;
        this.songsDao = songsDao;
        this.userDao = userDao;
        this.spotifyService =spotifyService;
    }
    @RequestMapping(path="/getAllSongs", method = RequestMethod.GET)
    public Root getAllSongs(){
        return spotifyService.getSpotifyPlaylist();
    }

}
