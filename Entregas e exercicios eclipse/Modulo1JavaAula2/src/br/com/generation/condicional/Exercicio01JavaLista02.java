package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio01JavaLista02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, numero3;
		
		System.out.println("Digite o 1� n�mero: ");
		numero1 = ler.nextDouble();
		System.out.println("Digite o 2� n�mero: ");
		numero2 = ler.nextDouble();
		System.out.println("Digite o 3� n�mero: ");
		numero3 = ler.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1 + " � o maior n�mero");
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2 + " � o maior n�mero");
		}
		
		else {
			System.out.println(numero3 + " � o maior n�mero");
		}
		
		ler.close();
			
	}

}
