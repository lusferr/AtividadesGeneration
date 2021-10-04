package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio01JavaLista02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, numero3;
		
		System.out.println("Digite o 1° número: ");
		numero1 = ler.nextDouble();
		System.out.println("Digite o 2° número: ");
		numero2 = ler.nextDouble();
		System.out.println("Digite o 3° número: ");
		numero3 = ler.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1 + " é o maior número");
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2 + " é o maior número");
		}
		
		else {
			System.out.println(numero3 + " é o maior número");
		}
		
		ler.close();
			
	}

}
