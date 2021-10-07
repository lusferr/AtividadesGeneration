package br.com.generation.entrega05;

public class objetoFuncionario {

	public static void main(String[] args) {
		funcionario fun = new funcionario();
		
		fun.nome = "Paulo";
		fun.cargo = "Java-Pleno";
		fun.id = 18;
		fun.horas = 0;
		
		fun.trab(60);
		System.out.println("Nome do funcionario: " + fun.nome);
		System.out.println("Cargo: " + fun.cargo);
		System.out.println("N° de Identificação: " + fun.id);
		System.out.println("Horas trabalhadas na semana: " + fun.horas);
		fun.falta(8);
		System.out.println("Horas trabalhadas após desconto de faltas: " + fun.horas);

	}

}
