package com.spring.contenedor.service;

import com.spring.contenedor.Greeting;

public class EmailService {

	private Greeting greeting;

	public EmailService(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public void sendMail(String to) {
		System.out.println("Sending mail to..." + to);
		System.out.println("Message: " + greeting.sayHello());
	}
}
