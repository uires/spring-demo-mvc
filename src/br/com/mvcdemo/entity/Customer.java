package br.com.mvcdemo.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	@NotNull(message = "Esse campo � obrigat�rio")
	@Size(min = 3, max = 30, message = "Esse campo tem que ter no m�nimo " 
			+ "3 caracteres e no m�ximo 30 caracteres")
	private String lastName;
	
	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
