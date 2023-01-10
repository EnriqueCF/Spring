package org.spring.core.service;

import java.util.Collection;

import org.spring.core.model.Film;

public interface FilmQueryService {

	Collection<Film> exec();
	
	FilmQueryService anyGenre(String... genres);

	FilmQueryService allGenres(String... genres);

	FilmQueryService year(String year);

	FilmQueryService betweenYears(String from, String to);

	FilmQueryService titleContains(String title);
}
