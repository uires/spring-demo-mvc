package br.com.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.mvcdemo.entity.Estudante;

@Controller(value = "/hello")
public class HelloWorldController {

	// preciso de um método no controlador para devolver o form incial
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}

	// preciso de um método processar a requisição (action)
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// novo método no controlador para ler dados de uma entidade com servlet request
	@RequestMapping("/processFormTwo")
	public String servletGetWay(HttpServletRequest request, Model model) {
		// read the parameter from the html form
		String parameter = request.getParameter("nome");
		// pass parameter to model object
		model.addAttribute("message", "Hellou dude : " + parameter.toUpperCase());
		return "helloworld";
	}

	// bind parameter with annotation @requestParam
	@RequestMapping("/processFormTree")
	public String popularObjetoEstudante(@RequestParam("nome") String nome, @RequestParam("idade") int idade,
			Model modelo) {
		modelo.addAttribute("estudanteData", new Estudante(nome, idade));
		return "helloworld";
	}

}
