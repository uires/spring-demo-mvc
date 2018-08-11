package br.com.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	// preciso de um m�todo no controlador para devolver o form incial
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}

	// preciso de um m�todo processar a requisi��o (action)
	@RequestMapping(value = "/processForm", method = RequestMethod.GET)
	public String processForm() {
		return "helloworld";
	}
}
