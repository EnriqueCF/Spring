package org.spring.core.dao;

import java.util.Collection;

import org.spring.core.model.Film;

public interface FilmDao {

	Film findById(long id);

	Collection<Film> findAll();

	void insert(Film film);

	void edit(Film film);

	void delete(long id);
}
