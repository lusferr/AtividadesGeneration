package br.com.generation.entrega05;

public class maquinaCafe {
	String marca;
	String cor;
	int temperatura;
	
	//funcoes
	void quente (int esquentar) {
		temperatura += esquentar;
	}
	void frio (int gelar) {
		temperatura -= gelar;
	}
}
