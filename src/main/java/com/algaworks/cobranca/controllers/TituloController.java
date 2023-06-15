package com.algaworks.cobranca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "titulos")
public class TituloController {

	@RequestMapping(name = "titulos/novo")
	public String novo() {
		return "CadastroTitulo";
	}
}
