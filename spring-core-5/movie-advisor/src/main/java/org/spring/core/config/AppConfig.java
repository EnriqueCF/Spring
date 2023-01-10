package org.spring.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;

@Getter
@Configuration
@ComponentScan(basePackages = "org.spring.core")
@PropertySource("classpath:/application.properties")
public class AppConfig {

	@Value("${file.path}")
	public String file;
	
	@Value("${file.csv.separator}")
	public String separator;
	
	@Value("${file.csv.list_separator}")
	public String listSeparator;
}
