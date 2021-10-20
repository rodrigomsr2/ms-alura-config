package br.com.alura.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsAluraConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAluraConfigApplication.class, args);
	}

}
