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
			System.out.println((i+1) + "� lan�amento: ");
			num = entrada.nextInt();
			
			while (num > 6 || num < 1) {
				System.out.println("Dado inv�lido!");
				System.out.println("Digite novamente o n�mero: ");
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
					System.out.println("A " + (i+1) + "� pontua��o �: " + dado[i]);
				}
				
		
		System.out.println("A m�dia dos valores lan�ados foi: " + media);
		System.out.println("O maior lado do dado foi: " + maiorDado + " e se repetiu " + qntMaiorDado);
		
		entrada.close();

	}

}
