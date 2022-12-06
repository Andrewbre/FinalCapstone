package com.techelevator.dao;

import com.techelevator.model.Genre;
import com.techelevator.model.Song;

import java.util.List;

public interface GenreDao {

    //TODO - don't need
//List<Genre> getAllGenres();

List<Genre> getGenresByDjId(int djId);

List<Genre> getGenresByEventId(int eventId);

void addGenreByEventId(int genreId, int eventId);


}
