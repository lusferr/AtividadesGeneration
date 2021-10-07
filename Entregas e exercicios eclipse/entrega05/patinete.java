package br.com.generation.entrega05;

public class patinete {
	String cor;
	String tamanho;
	int recomendado;
	int velocidade;
	
	void andando(int andando) {
		velocidade += andando;
	}
	void parada(int parou) {
		velocidade -= parou;
	}
}
