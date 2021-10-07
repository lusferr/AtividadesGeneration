package br.com.generation.entrega05;

public class funcionario {
	String nome;
	String cargo;
	String setor;
	int id;
	int horas;
	
	//funcoes
	
	void trab(int trabalhou) {
		horas += trabalhou;
	}
	void falta(int faltou) {
		horas -= faltou;
	}
}
