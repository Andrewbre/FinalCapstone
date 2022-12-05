package com.techelevator.controller;

import com.techelevator.dao.SongDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class SongController {

    private SongDao songDao;

    public SongController(SongDao Songdao) {
        this.songDao = Songdao;
    }



}
