package br.com.generation.entrega08;

public class mercadoria {

	private String nome;
	private int cdg;
	private int valor;
	
	
	
	public mercadoria(String nome, int cdg, int valor) {
		super();
		this.nome = nome;
		this.cdg = cdg;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCdg() {
		return cdg;
	}
	public void setCdg(int cdg) {
		this.cdg = cdg;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return " Nome: " + this.nome + " Código: " + this.cdg + " Valor R$ " + this.valor;
	}
	
}
