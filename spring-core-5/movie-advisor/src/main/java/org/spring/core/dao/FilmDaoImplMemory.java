package org.spring.core.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.spring.core.config.AppConfig;
import org.spring.core.model.Film;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class FilmDaoImplMemory implements FilmDao {

	private List<Film> films = new ArrayList<>();

	private final AppConfig appConfig;

	public void init() {
		films = UtilFilmReader.readFile(appConfig.getFile(), appConfig.getSeparator(), appConfig.getListSeparator());
	}

	public Film findById(long id) {

		Optional<Film> result = films
				.stream()
				.filter(f -> f.getId() == id)
				.findFirst();
		return result.orElse(null);

	}

	public Collection<Film> findAll() {
		return films;
	}

	public void insert(Film film) {
		films.add(film);
	}

	public void edit(Film film) {
		int index = getIndexOf(film.getId());
		if (index != -1)
			films.set(index, film);
	}

	public void delete(long id) {
		int index = getIndexOf(id);
		if (index != -1) 
			films.remove(index);

	}

	private int getIndexOf(long id) {
		boolean encontrado = false;
		int index = 0;

		while (!encontrado && index < films.size()) {
			if (films.get(index).getId() == id)
				encontrado = true;
			else
				index++;
		}

		return (encontrado) ? index : -1;
	}

}
