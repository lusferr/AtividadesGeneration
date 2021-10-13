package br.com.generation.entrega07;

public class Animal {
	
	private String nome;
	private int idade;
	
	
	public void som() {
		System.out.println("Animal emitindo seu som");
		
	}
	public void acao() {
		System.out.println("Animal fazendo sua açao caracteristica");
	}
	
	//Getters and Setters
	
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
	
}
