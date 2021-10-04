package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio04JavaLista02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
				
		if (num % 2 == 0) {
			System.out.println("O número é par e sua raiz é: " + Math.sqrt(num));
		}
		else {
			System.out.println("O número é impar e elevado ao quadrado é = " + Math.pow(num, 2));
		}
		
		ler.close(); 

	}

}
