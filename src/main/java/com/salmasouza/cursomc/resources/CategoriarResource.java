package com.salmasouza.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriarResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String Listar() {
		return "Rest está funcionando!";
	}
	
	
}
