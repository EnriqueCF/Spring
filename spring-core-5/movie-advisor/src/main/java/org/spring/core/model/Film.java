package org.spring.core.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Film {

	private long id;
	private String tittle;
	private String year;
	private List<String> genres;
}
