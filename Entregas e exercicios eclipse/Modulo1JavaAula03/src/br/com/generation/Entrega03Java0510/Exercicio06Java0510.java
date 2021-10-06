package br.com.generation.Entrega03Java0510;

import java.util.Scanner;

public class Exercicio06Java0510 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, soma = 0, contador = 0;
		
		do {
			System.out.println("Digite um número qualquer: ");
			num = entrada.nextInt();
			contador++;
			
			if (num % 3 == 0) {
				soma=soma+num;
			}
		}
		while(num != 0);
		
		System.out.println("A média dos multiplos de 3 foi: " + soma/contador);
		
		entrada.close();
	}

}
