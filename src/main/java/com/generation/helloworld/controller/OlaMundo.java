package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Ola")
public class OlaMundo {
	@GetMapping
	public String olaMundo() {
		return "Olá Mundo!!!!";
	}
}
