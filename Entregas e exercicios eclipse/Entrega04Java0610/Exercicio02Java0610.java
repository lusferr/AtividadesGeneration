package br.com.generation.Entrega04Java0610;

import java.util.Scanner;

public class Exercicio02Java0610 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] dado = new int[10];
		int i = 0;
		int qntMaiorDado = 0;
		int maiorDado = 0;
		int soma = 0;
		int media = 0;
		int num;
		
		for(i = 0; i < dado.length; i++) {
			System.out.println((i+1) + "° lançamento: ");
			num = entrada.nextInt();
			
			while (num > 6 || num < 1) {
				System.out.println("Dado inválido!");
				System.out.println("Digite novamente o número: ");
				num = entrada.nextInt();
			}
			dado[i] = num;
			soma += dado[i];
			media = soma/10;
			
				if(dado[i] > maiorDado) {
					maiorDado = dado[i];
				}
			
				
			}
			
			for (i = 0; i < dado.length; i++) {
				if(dado[i] == maiorDado) {
					qntMaiorDado++;
				}
			}
		
				
				for(i = 0; i < dado.length; i++) {
					System.out.println("A " + (i+1) + "° pontuação é: " + dado[i]);
				}
				
		
		System.out.println("A média dos valores lançados foi: " + media);
		System.out.println("O maior lado do dado foi: " + maiorDado + " e se repetiu " + qntMaiorDado);
		
		entrada.close();

	}

}
