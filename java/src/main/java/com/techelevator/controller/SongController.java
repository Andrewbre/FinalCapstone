package com.techelevator.controller;

import com.techelevator.dao.SongDAO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class SongController {

    private SongDAO songDAO;
}
