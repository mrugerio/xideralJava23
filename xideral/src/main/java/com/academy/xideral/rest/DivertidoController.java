package com.academy.xideral.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivertidoController {
	
	@GetMapping("/sayHello")
	public String saludar() {
		return "Hello Academy Java Xideral";
	}

}
