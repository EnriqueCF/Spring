package com.spring.contenedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Greeting
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

	private String message;

	/**
	 * 
	 * @return
	 */
	public String sayHello() {
		return message;
	}
}
