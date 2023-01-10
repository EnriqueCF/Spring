package org.spring.core;

import java.util.Collection;

public interface FilmDao {
	
	public Film findById(int id);
	public Collection<Film> findAll();
	public void insert(Film film);
	public void edit(Film old, Film newfilm);
	public void delete(Film film);
}
