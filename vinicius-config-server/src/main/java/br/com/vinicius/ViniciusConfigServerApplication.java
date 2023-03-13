package br.com.vinicius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ViniciusConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViniciusConfigServerApplication.class, args);
	}

}
