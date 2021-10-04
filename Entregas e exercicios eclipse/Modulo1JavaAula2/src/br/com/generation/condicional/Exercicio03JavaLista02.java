package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio03JavaLista02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade? ");
		idade = ler.nextInt();
		
		if (idade > 10 && idade <= 14) {
			System.out.println("Você esta na categoria infantil");
		}
		else if (idade > 14 && idade <= 17) {
			System.out.println("Você esta na categoria juvenil");
		}
		else if (idade > 17 && idade <= 25) {
			System.out.println("Você esta na categoria adulto");
		}
		
		else {
			System.out.println("Sua idade não correponde a nenhuma categoria.");
		}
		
		ler.close(); 
	}

}
