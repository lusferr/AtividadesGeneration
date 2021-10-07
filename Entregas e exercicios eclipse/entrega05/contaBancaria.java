package br.com.generation.entrega05;

public class contaBancaria {

	private int nmrC;
	private int saldo;
	private String nome;
	
	void saque (int sacando) {
		saldo -= sacando;
	}
	void deposito (int depositando) {
		saldo += depositando;
	}
	public int getNmrC() {
		return nmrC;
	}
	public void setNmrC(int nmrC) {
		this.nmrC = nmrC;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
