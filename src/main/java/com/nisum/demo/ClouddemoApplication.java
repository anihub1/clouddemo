package com.nisum.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClouddemoApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(ClouddemoApplication.class, args);
		System.out.println("main");
	} 
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void run(String... args) throws Exception {
	
		org.apache.tomcat.jdbc.pool.DataSource tomcat = (org.apache.tomcat.jdbc.pool.DataSource) dataSource;
		System.err.println(tomcat.getDriverClassName() + ", " + tomcat.getUrl());
	}


	
	@RequestMapping("/home")
	public String home() {
		
		System.out.print("homeeeee#######");
		
		return "Im very goodddd anish hudsf helloo change1";
	}
}



