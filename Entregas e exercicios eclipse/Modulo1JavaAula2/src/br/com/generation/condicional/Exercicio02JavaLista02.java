package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio02JavaLista02 {

	public static void main(String[] args) {	
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;

		System.out.println("Digite o 1� n�mero: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o 2� n�mero: ");
		numero2 = ler.nextInt();
		System.out.println("Digite o 3� n�mero: ");
		numero3 = ler.nextInt();
		
		if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			System.out.println("Ordem dos n�meros" + numero1 + numero2 + numero3 );
		}
		if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
			System.out.println("Ordem dos n�meros" + numero2 + numero3 + numero1 );
		}
		if (numero3 <= numero2 && numero3 <= numero2 && numero2 <= numero1) {
			System.out.println("Ordem dos n�meros" + " " + numero3+ " " +numero2 + " " +numero1 );
		}
		
		ler.close();
		
	}

}
