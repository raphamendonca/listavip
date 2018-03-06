package br.com.verity.listavip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.verity.listavip.model.Convidado;
import br.com.verity.listavip.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {

	@Autowired
	private ConvidadoRepository repository;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("listaConvidados")
	public String listaConvidadods(Model model) {
		
		Iterable<Convidado> convidados = repository.findAll();
		model.addAttribute(convidados);
		
		return "listaConvidados";
	}
}
