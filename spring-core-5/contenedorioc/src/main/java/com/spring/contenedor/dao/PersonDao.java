package com.spring.contenedor.dao;

import java.util.List;

import com.spring.contenedor.domain.Person;

public interface PersonDao {

	public Person findByIndex(int index);
	public List<Person> findAll();
	public void insert(Person persona);
	public void edit(int index, Person person);
	public void delete(int index);
	public void delete(Person person);
}
