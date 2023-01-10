package com.spring.contenedor.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.spring.contenedor.dao.PersonDao;
import com.spring.contenedor.domain.Person;

public class PersonDaoImplMemory implements PersonDao, InitializingBean, DisposableBean {

	List<Person> people = new ArrayList<>();

	public Person findByIndex(int index) {
		return people.get(index);
	}

	public List<Person> findAll() {
		return people;
	}

	public void insert(Person person) {
		people.add(person);
	}

	public void edit(int index, Person person) {
		people.remove(index);
		people.add(index, person);
	}

	public void delete(int index) {
		people.remove(index);
	}

	public void delete(Person person) {
		people.remove(person);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		insert(new Person("Luismi", 35));
		insert(new Person("Ana", 32));
		insert(new Person("Pepe", 34));
		insert(new Person("Julia", 39));
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Borrando la lista...");
		people.clear();
	}
}