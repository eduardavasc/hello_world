package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("BSMS")
public class ListaBsm {
	@GetMapping
	public String listaBsm() {
		return  " Responsabilidade Pessoal; " + "\n Mentalidade de Crescimento; " + "\n Orientação ao futuro; "
				+ "\n Persistência; " + "\n Comunicação; " + "\n Atenção aos detalhes; " + "\n Atenção aos detalhes; "
				+ "\n Trabalho em equipe; " + "\n Persistência. ";
	}
}