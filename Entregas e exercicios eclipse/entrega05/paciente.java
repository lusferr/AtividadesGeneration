package br.com.generation.entrega05;

public class paciente {
	private String nome;
	private int id;
	private int status;
	private String situ;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSitu() {
		return situ;
	}
	public void setSitu(String situ) {
		this.situ = situ;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	void alta (int alta) {
		status -= alta;
	}
	void adms (int adms) {
		status += adms;
	}
	
	
		
}
