package br.com.generation.entrega05;

public class Aviao {
	String modelo;
	String tamanho;
	int id;
	int velocidade;
	
	//----fun��es----
	void acelerar (int aceleracao) {
		velocidade += aceleracao;
	}
	void frear (int freando) {
		velocidade -= freando;
	}
	
}
