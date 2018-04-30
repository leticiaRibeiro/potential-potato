package br.com.exemplo.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortfolioController {

	@RequestMapping("/olahtml")
	public String mostraOlaHmtl() {
		return "olahtml";
	}
	
	@RequestMapping("/olajsp")
	public String mostraOlaJsp() {
		return "olajsp";
	}
}
