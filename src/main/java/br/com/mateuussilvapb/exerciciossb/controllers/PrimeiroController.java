package br.com.mateuussilvapb.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	/*
	 * A notação abaixo serve para definir o método 'ola' como sendo o método que
	 * deve ser invocado ao acessar a página no navegador. Sem o parâmetro 'path',
	 * esse método será invocado por padrão, sempre que a página inicial for
	 * acessada. Porém, ao definir o parâmetro 'path', para o exemplo em questão, a
	 * página só será acessada quando o link for acrescido de '/ola'. Além disso, o
	 * parâmetro pode ser alimentado com um conjunto de links, sendo que quando
	 * qualquer um for acessado, o método será invocado.
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/ola1")
	public String ola() {
		return "Olá Spring Boot (RequestMapping)!";
	}

	@GetMapping(path = "/ola2")
	public String saudacao() {
		return "Olá Spring Boot (GetMapping)!";
	}

	@PostMapping(path = "/ola3")
	public String saudacao2() {
		return "Olá Spring Boot (PST)!";
	}
}
