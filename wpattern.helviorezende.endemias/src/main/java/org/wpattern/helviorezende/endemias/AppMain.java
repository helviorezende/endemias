package org.wpattern.helviorezende.endemias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wpattern.helviorezende.endemias.utils.AppContext;

@SpringBootApplication
public class AppMain {

	public static void main(String[] args){
		SpringApplication.run(AppContext.class, args);
		
	}
}