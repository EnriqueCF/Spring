package org.spring.core.service;

import java.util.Collection;
import java.util.function.Predicate;

import org.spring.core.dao.FilmDao;
import org.spring.core.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmQueryServiceImpl implements FilmQueryService {

	@Autowired
	private FilmDao dao;
	
	private Predicate<Film> predicate;
	
	@Override
	public Collection<Film> exec() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilmQueryService anyGenre(String... genres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilmQueryService allGenres(String... genres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilmQueryService year(String year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilmQueryService betweenYears(String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilmQueryService titleContains(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
