package org.spring.core;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Film {
	private String title;
	private String year;
	private String type;
}