package br.com.generation.entrega05;

public class Aviao {
	String modelo;
	String tamanho;
	int id;
	int velocidade;
	
	//----funções----
	void acelerar (int aceleracao) {
		velocidade += aceleracao;
	}
	void frear (int freando) {
		velocidade -= freando;
	}
	
}
