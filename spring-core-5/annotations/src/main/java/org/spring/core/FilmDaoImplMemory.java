package org.spring.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FilmDaoImplMemory implements FilmDao {

	private List<Film> films = new ArrayList<>();

	public Film findById(int id) {
		return films.get(id);
	}

	public Collection<Film> findAll() {
		return films;
	}

	public void insert(Film pelicula) {
		films.add(pelicula);
	}

	public void edit(Film antigua, Film nueva) {
		films.remove(antigua);
		films.add(nueva);
	}

	public void delete(Film pelicula) {
		films.remove(pelicula);
	}

	@PostConstruct
	public void init() {
		insert(new Film("La guerra de las galaxias", "1977", "Ciencia ficción"));
		insert(new Film("La lista de Schindler", "1993", "Drama"));
		insert(new Film("El Padrino", "1972", "Drama"));
		insert(new Film("Apocalypse Now", "1979", "Bélico"));
		insert(new Film("Gladiator", "2000", "Acción"));
		insert(new Film("El Gran Dictador", "1940", "Comedia"));
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Borrando...");
		this.films.clear();
	}
}