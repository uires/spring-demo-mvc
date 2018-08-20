package br.com.mvcdemo.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.mvcdemo.validation.CourseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Getter
	@Setter
	private String firstName;

	@NotNull(message = "Esse campo � obrigat�rio")
	@Size(min = 3, max = 30, message = "Esse campo tem que ter no m�nimo " + "3 caracteres e no m�ximo 30 caracteres")
	@Setter
	@Getter
	private String lastName;

	/*
	* 
	* 
	*/
	@NotNull(message = "Precisa ser um valor inteiro!")
	@Min(value = 5, message = "O c�digo deve ser maior que 5")
	@Max(value = 3000, message = "N�mero acima do definido.")
	@Setter
	@Getter
	private Integer codigoAutorizacao;
	
	@Setter
	@Getter
	@CourseCode()
	private String courseCode ;

}
