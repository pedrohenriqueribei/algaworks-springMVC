package com.algaworks.cobranca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.cobranca.domain.model.Titulo;
import com.algaworks.cobranca.repositories.TituloRepository;

@Controller
@RequestMapping("titulos")
public class TituloController {

	@Autowired
	private TituloRepository tituloRepository;
	
	//@RequestMapping("/titulos/novo")  -- funciona
	@GetMapping("novo")
	public String novo() {
		return "CadastroTitulo";
	}
	
	@RequestMapping (method = RequestMethod.POST)
	public String salvar(Titulo titulo) {
		// TODO: Salvar titulo no banco de dados
		
		System.out.println("CHEGOU NO CONTROLLER: " + titulo.getDescricao());
		
		tituloRepository.save(titulo);
		
		return "CadastroTitulo";
	}
}
