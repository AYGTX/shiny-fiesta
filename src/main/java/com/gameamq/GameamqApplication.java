package com.gameamq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.gameamq.*")
@SpringBootApplication
public class GameamqApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameamqApplication.class, args);
	}

}
