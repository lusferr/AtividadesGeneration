package br.com.generation.Entrega03Java0510;

import java.util.Scanner;

public class Exercicio05Java0510 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int num, i = 0;
		
		do { 
			i++;
			System.out.println("Digite o " + (i+1) + "° número qualquer: ");
			num = entrada.nextInt();
			
		}
		while(num != 0);
		
		System.out.println("Você acertou o número secreto, programa finalizado!");
		
		entrada.close();

	}

}
