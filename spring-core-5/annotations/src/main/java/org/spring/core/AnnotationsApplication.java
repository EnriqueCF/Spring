package org.spring.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		FilmService filmService = appContext.getBean(FilmService.class);
		
		filmService.filmsByType("Drama").forEach(System.out::println);
				
		((AnnotationConfigApplicationContext) appContext).close();
	}

}
