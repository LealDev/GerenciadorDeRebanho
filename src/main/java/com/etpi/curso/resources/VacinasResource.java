package com.etpi.curso.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/vacinas")
public class VacinasResource {

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return"REST esta funcionando";
	}
}
