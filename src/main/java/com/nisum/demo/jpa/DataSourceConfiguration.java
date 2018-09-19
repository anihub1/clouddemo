package com.nisum.demo.jpa;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfiguration {

	@Value("spring.datasource.username")
	private String userName;
	
	@Value("spring.datasource.password")
	private String password;
	@Value("spring.datasource.url")
	private String url;
	
	
	
	

	@Bean
	@Primary
	public DataSourceProperties dataSourceProperties() {
	    DataSourceProperties properties = new DataSourceProperties();
	    properties.setInitialize(false);
	        properties.setUrl(url);
	        properties.setUsername(userName);
	        properties.setPassword(password);
	    return properties;
	}

	

	@Bean
	//@ConfigurationProperties("spring.datasource")
	public DataSource secondDataSource() {
		System.out.println(" datasource########################## ");
		return  dataSourceProperties().initializeDataSourceBuilder().build();
	}

}
