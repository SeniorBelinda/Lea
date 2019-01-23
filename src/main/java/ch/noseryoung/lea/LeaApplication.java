package ch.noseryoung.lea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class LeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaApplication.class, args);
	}

}

