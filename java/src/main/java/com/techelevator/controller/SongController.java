package com.techelevator.controller;

import com.techelevator.dao.SongsDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class SongController {

    private SongsDao songsDao;

    public SongController(SongsDao songdao) {
        this.songsDao = songdao;
    }

}
