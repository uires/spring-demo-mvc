package br.com.mvcdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.mvcdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	/*
	*	@InitiBinder é uma anotação que carrega meta-dados
	*	para pré-processamento.
	*	 
	*/
	@InitBinder
	public void initBinder(WebDataBinder theDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		theDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public ModelAndView showForm() {
		return new ModelAndView("customer/customer-form").addObject("customer", new Customer());
	}

	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public ModelAndView processForm(@Valid Customer theCustomer, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("customer/customer-form");
		}
		return new ModelAndView("customer/customer-confirmacao").addObject("customer", theCustomer);
	}

}
