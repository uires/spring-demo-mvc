package br.com.mvcdemo.entity;

public class Estudante {
	private String nome;
	private int idade;
	private String country;
	private char sexo;

	public Estudante() {
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
}
