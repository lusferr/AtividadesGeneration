package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio04JavaLista02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
				
		if (num % 2 == 0) {
			System.out.println("O n�mero � par e sua raiz �: " + Math.sqrt(num));
		}
		else {
			System.out.println("O n�mero � impar e elevado ao quadrado � = " + Math.pow(num, 2));
		}
		
		ler.close(); 

	}

}
