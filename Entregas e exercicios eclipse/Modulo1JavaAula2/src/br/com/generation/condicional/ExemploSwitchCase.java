package br.com.generation.condicional;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Escreva um letra entre A e D: ");
		
		String letra = entrada.nextLine();
		
		switch(letra) {
			case "a":
				System.out.println("Ana");
			break;
			case "b":
				System.out.println("Bruno");
			break;	
			case "c":
				System.out.println("Caio");
			break;	
			case "d":
				System.out.println("Diego");
			break;
			
			default:
				System.out.println("Operação inválida.");
		}
		entrada.close();
	}

}
