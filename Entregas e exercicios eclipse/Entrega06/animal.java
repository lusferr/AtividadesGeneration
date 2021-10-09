package br.com.generation.Entrega06;

public class animal {
	private String tipo;
	private String nome;
	private int idade;
	private String som;
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}

	private String movimento;
	
	//void
	void barulho (String barulho) {
		som = barulho;
	}
	void correndo (String andar) {
		movimento = andar;
	}
	void galopando (String galopar) {
		movimento = galopar;
	}
	void subindo (String subir) {
		movimento = subir;
	}
	
	
	
	
}
