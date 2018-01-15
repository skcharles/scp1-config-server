package io.mytech.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Scp1ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Scp1ConfigServerApplication.class, args);
	}
}
