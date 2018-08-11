package br.com.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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

	// novo método no controlador para ler dados de uma entidade
	@RequestMapping("/processFormTwo")
	public String servletGetWay(HttpServletRequest request, Model model) {
		// read the parameter from the html form
		String parameter = request.getParameter("nome");
		// parse parameter to uppercase
		parameter = parameter.toUpperCase();
		// pass parameter to model object
		model.addAttribute("message", "Hellou dude : " + parameter);
		return "helloworld";
	}

}
