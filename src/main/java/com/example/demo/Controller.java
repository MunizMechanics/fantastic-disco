package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private GraduacaoRepositorioV2 gr;
	
	//GRADUAÇOES
	@RequestMapping("/graduacao")
	public String consultarGraduacoes(Model model) {
		model.addAttribute("graduacoes", gr.findAll());
		return "graduacao";
	}	
	
	//INSERIR GRADUACOES
	@PostMapping("/graduacao")
	public String insereGraduacao(@RequestParam("idGraduacao") Integer x, @RequestParam("nomeGraduacao") String name, @RequestParam("siglaGraduacao") String sigla, Model model) {
		Graduacao g = new Graduacao(x, name, sigla);
		gr.save(g);
		return "graduacao";
	}
	
	@GetMapping("/graduacao")
	public String insereGraduacao() {
		return "graduacao";
	}

}
