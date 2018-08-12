package br.com.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mvcdemo.entity.Estudante;

@Controller("/estudante")
@RequestMapping("/estudante")
public class EstudanteController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// instance object estudante
		Estudante estudante = new Estudante();

		// add student object to the model object
		model.addAttribute("estudante", estudante);
		return "estudante/formulario-estudante";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("estudante") Estudante estudante) {
		System.out.println("Estudante: " + estudante.getNome() + " and you have: " + estudante.getIdade() + " years");
		return "estudante/confimacao-estudante";
	}
}
