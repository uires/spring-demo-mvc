package br.com.mvcdemo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.mvcdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public ModelAndView showForm() {
		return new ModelAndView("customer/customer-form").addObject("customer", new Customer());
	}
	
	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public ModelAndView processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("customer/customer-form");
		}
		return new ModelAndView();
	}
	
}
