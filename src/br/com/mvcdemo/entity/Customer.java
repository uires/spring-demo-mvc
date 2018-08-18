package br.com.mvcdemo.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	@NotNull(message = "Esse campo � obrigat�rio")
	@Size(min = 3, max = 30, message = "Esse campo tem que ter no m�nimo " 
			+ "3 caracteres e no m�ximo 30 caracteres")
	private String lastName;
	
	@Min(value = 5, message = "O c�digo deve ser maior que 5 digitos")
	@Max(value = 25, message = "O c�digo dever ter menos de 25 digitos")
	private int codigoAutorizacao;

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

	public int getCodigoAutorizacao() {
		return codigoAutorizacao;
	}

	public void setCodigoAutorizacao(int codigoAutorizacao) {
		this.codigoAutorizacao = codigoAutorizacao;
	}

}
