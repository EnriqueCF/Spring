package org.spring.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilmService {

	//@Autowired
	private FilmDao filmDao;
	
	//@Autowired
	public FilmService(FilmDao filmDao) {
		this.filmDao = filmDao;
	}

	public List<Film> filmsByType(String type) {
		return filmDao
				.findAll()
				.stream()
				.filter(p -> p.getType().equalsIgnoreCase(type))
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// @Autowired
	public void setFilmDao(FilmDao filmDao) {
		this.filmDao = filmDao;
	}
}