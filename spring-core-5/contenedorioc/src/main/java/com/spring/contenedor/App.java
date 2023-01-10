/**
 * 
 */
package com.spring.contenedor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.contenedor.config.AppConfig;
import com.spring.contenedor.dao.PersonDao;
import com.spring.contenedor.service.EmailService;

/**
 * 
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeting greeting = (Greeting) appContext.getBean("greeting");	// id
//		greeting = appContext.getBean(Greeting.class);					// class
//		greeting = appContext.getBean("greeting", Greeting.class);		// id, class
		System.out.println(greeting.sayHello());

		EmailService service = appContext.getBean(EmailService.class);
		service.sendMail("email@email.con");

		
		PersonDao personaDAO = appContext.getBean(PersonDao.class);
		
		personaDAO.findAll().forEach(System.out::println);
		((AnnotationConfigApplicationContext) appContext).close();
	}

}
