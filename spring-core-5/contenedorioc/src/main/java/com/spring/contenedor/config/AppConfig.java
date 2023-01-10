package com.spring.contenedor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.contenedor.Greeting;
import com.spring.contenedor.dao.PersonDao;
import com.spring.contenedor.dao.impl.PersonDaoImplMemory;
import com.spring.contenedor.service.EmailService;

@Configuration
public class AppConfig {

	@Bean
	public Greeting greeting() {
		// Setter
		Greeting greeting = new Greeting();
		greeting.setMessage("Hello world!!");
		return greeting;
		
		// Constructor
		//return new Greeting("Hello world");
	}
	
	
	@Bean
	public EmailService emailService(Greeting greeting) {
		return new EmailService(greeting);
	}
	
	/**
	 * Bean con la implementacion de PersonDao - Initializing bean
	 * @return
	 */
	@Bean
	public PersonDao person() {
		return new PersonDaoImplMemory();
	}
}
