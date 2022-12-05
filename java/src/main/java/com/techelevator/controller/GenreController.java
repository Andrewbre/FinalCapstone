package com.techelevator.controller;

import com.techelevator.dao.GenreDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class GenreController {

    private GenreDao genreDao;
}
