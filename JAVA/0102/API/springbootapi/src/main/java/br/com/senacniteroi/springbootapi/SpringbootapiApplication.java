package br.com.senacniteroi.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *arquitetura MVC
 * 
 * controllers - vão administrar as requisições
 * models - serão o modelo das requisições
 * views - frontend pronto que exibira o resultado
 * services - vão "servir" as requisições
 * 
 * 
 * 
 */

@SpringBootApplication
public class SpringbootapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapiApplication.class, args);
	}

}
