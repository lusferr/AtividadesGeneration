package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio02JavaLista02 {

	public static void main(String[] args) {	
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;

		System.out.println("Digite o 3 n�meros: ");
		numero1 = ler.nextInt();	
		numero2 = ler.nextInt();	
		numero3 = ler.nextInt();
		
		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println("Ordem dos n�meros" + " " + numero1 + " " +  numero2 + " " + numero3);
		}
		else if (numero1 <= numero3 && numero3 <= numero2) {
			System.out.println("Ordem dos n�meros" + " " +numero1 + " " +numero3 + " " + numero2);
		}
		else if (numero2 <= numero1 && numero1 <= numero3 ) {
			System.out.println("Ordem dos n�meros" + " " + numero2+ " " +numero1 + " " +numero3);
		}
		else if (numero2 <= numero3 && numero3 <= numero1 ) {
			System.out.println("Ordem dos n�meros" + " " + numero2+ " " +numero3+ " " +numero1);
		}
		else if(numero3 <= numero1 && numero1 <= numero2 ) {
			System.out.println("Ordem dos n�meros" + " " + numero3+ " " +numero1 + " " +numero2);
		}
		else {
			System.out.println("Ordem dos n�meros" + " " + numero3+ " " +numero2 + " " +numero1);
		}
		
		
		
		
		ler.close();
		
	}

}
