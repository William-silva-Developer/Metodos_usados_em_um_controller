package com.carro.carros.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	
	@GetMapping()
	public String Get() {
		return "Olá mundo";
	};
	
	//OBS: ESSE EXEMPLO COM O GETMAPPING FOI APENAS PARA DIFERENCIAR DO POST(O CORRETO É USAR O POST PARA ESCONDER A SENHA MELHOR).
	@GetMapping("/login")
	public String Login(@RequestParam("login") String login,@RequestParam("senha") String senha) {
		
		return "login: " +login + " senha: " + senha;
		
	};
	
	//OBS: NESTE EXEMPLO FOI USANDO O "PathVariable" NO LUGAR DO "RequestParam"
	@GetMapping("/login/{login}/senha/{senha}")
	public String LoginVariable(@PathVariable("login") String login,@PathVariable("senha") String senha) {
		
		return "login: " +login + " senha: " + senha;
		
	};
	
}
