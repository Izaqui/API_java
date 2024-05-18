package com.example.project_dev;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		servers = {
				@Server(url = "http://localhost:8080", description = "Local Server")
		}
)
@SpringBootApplication
public class ProjectDevApplication {
	/**
	 * Método principal que inicia a aplicação Spring Boot.
	 *
	 * @param args Argumentos de linha de comando
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(ProjectDevApplication.class, args);
		} catch (Exception e) {
			System.err.println("Erro ao iniciar a aplicação: " + e.getMessage());
			// exceções
		}
	}

}
