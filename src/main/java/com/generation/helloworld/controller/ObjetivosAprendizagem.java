package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Aprendizagem")

public class ObjetivosAprendizagem {
	@GetMapping
	public String objetivosAprendizagem() {
		return  "Aprender Spring Boot\n" + "Melhorar habilidades em Java\n"+ "Compreender princípios de desenvolvimento web";
	}
}

