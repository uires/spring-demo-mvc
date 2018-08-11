package br.com.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// preciso de um método no controlador para devolver o form incial
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}
	// preciso de um método processar a requisição (action) 
}
