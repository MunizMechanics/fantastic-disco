package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class Controllerzinho {
	@Autowired
	private GraduacaoRepositorioV2 gr;
	@Autowired
	private CalibreRepositorioV2 cr;
	@Autowired
	private ArmaRepositorioV2 ar;
	@Autowired
	private MilitarRepositorioV2 mr;
	
	//CONSULTA GRADUAÇOES
	@RequestMapping("/consultaGraduacao")
	public String consultarGraduacoes(Model model) {
		model.addAttribute("graduacoes", gr.findAll());
		return "consultaGraduacao";
	}	
	
	//------------------------------------------------------------------------------
	//CONSULTA CALIBRES
	@RequestMapping("/consultaCalibre")
	public String consultarCalibres(Model model) {
		model.addAttribute("calibres", cr.findAll());
		return "consultaCalibre";
	}
	
	//------------------------------------------------------------------------------
	//CONSULTA ARMAS
	@RequestMapping("/consultaArma")
	public String consultarArmas(Model model) {
		model.addAttribute("armas", ar.findAll());
		return "consultaArma";
	}
	
	//CONSULTA MILITARES
	@RequestMapping("/consultaMilitar")
	public String consultarMilitar(Model model) {
		model.addAttribute("militares", mr.findAll());
		return "consultaMilitar";
	}
	
	//------------------------------------------------------------------------------
	//INSERIR GRADUACOES
	@PostMapping("/insereGraduacao")
	public String insereGraduacao(@RequestParam("idGraduacao") Integer idGraduacao, @RequestParam("nomeGraduacao") String nameGraduacao, @RequestParam("siglaGraduacao") String siglaGraduacao, Model model) {
		Graduacao g = new Graduacao(idGraduacao, nameGraduacao, siglaGraduacao);
		gr.save(g);
		return "insereGraduacao";
	}
	@GetMapping("/insereGraduacao")
	public String insereGraduacao() {
		return "insereGraduacao";
	}
	
	//------------------------------------------------------------------------------
	//INSERIR CALIBRES
	@PostMapping("/insereCalibre")
	public String insereCalibre(@RequestParam("idCalibre") Integer idCalibre, @RequestParam("nomeCalibre") String nomeCalibre, Model model) {
		Calibre c = new Calibre(idCalibre, nomeCalibre);
		cr.save(c);
		return "insereCalibre";
	}
	@GetMapping("/insereCalibre")
	public String insereCalibre() {
		return "insereCalibre";
	}
	
	//------------------------------------------------------------------------------
	//INSERIR ARMAS
	@PostMapping("/insereArma")
	public String insereArma(@RequestParam("idArma") Integer idArma, @RequestParam("idCalibre") Integer idCalibre, @RequestParam("nomeArma") String nomeArma, Model model) {
		Calibre x = cr.findOne(idCalibre);
		Arma a = new Arma(idArma, x, nomeArma);
		ar.save(a);
		return "insereArma";
	}
	@GetMapping("/insereArma")
	public String insereArma() {
		return "insereArma";
	}
	
	//------------------------------------------------------------------------------
	//INSERIR MILITARES
	@PostMapping("/insereMilitar")
	public String insereMilitar(@RequestParam("idMilitar") Integer idMilitar, @RequestParam("idGraduacao") Integer idGraduacao, @RequestParam("nomeMilitar") String nomeMilitar, Model model) {
		Graduacao x = gr.findOne(idGraduacao);
		Militar m = new Militar(idMilitar, x, nomeMilitar);
		mr.save(m);
		return "insereMilitar";
	}
	@GetMapping("/insereMilitar")
	public String insereMilitar() {
		return "insereMilitar";
	}

}
