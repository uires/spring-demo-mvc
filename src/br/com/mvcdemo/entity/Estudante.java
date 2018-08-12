package br.com.mvcdemo.entity;

import java.util.LinkedHashMap;

public class Estudante {
	private String nome;
	private int idade;
	private String country;
	private char sexo;
	private String[] materia;
	private LinkedHashMap<String, String> listaPaises;

	public Estudante() {
		this.listaPaises = new LinkedHashMap<>();

		listaPaises.put("BR", "Brasil");
		listaPaises.put("AL", "Alemanha");
		listaPaises.put("IN", "India");
		listaPaises.put("FR", "França");
		
	}

	public Estudante(String nome, int idade, String country) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setCountry(country);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String[] getMateria() {
		return materia;
	}

	public void setMateria(String[] materia) {
		this.materia = materia;
	}

	public LinkedHashMap<String, String> getListaPaises() {
		return listaPaises;
	}

	public void setListaPaises(LinkedHashMap<String, String> listaPaises) {
		this.listaPaises = listaPaises;
	}

}
