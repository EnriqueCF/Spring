package org.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean
	FilmService filmService(FilmDao filmDao) {
		return new FilmService(filmDao);
	}
	
	@Bean
	FilmDao filmDao(){
		return new FilmDaoImplMemory();
	}
}
