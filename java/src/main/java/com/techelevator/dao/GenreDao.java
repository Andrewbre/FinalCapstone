package com.techelevator.dao;

import com.techelevator.model.Genre;
import com.techelevator.model.Song;

import java.util.List;
import java.util.Queue;

public interface GenreDao {

List<Genre> getGenresByDjId(int djId);

List<Genre> getGenresByEventId(int eventId);

Genre getGenresByGenreId(int genreId);
}
