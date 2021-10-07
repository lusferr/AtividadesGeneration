package br.com.generation.Entrega04Java0610;

import java.util.Scanner;

public class Exercicio01Java0610 {

	public static void main(String[] args) {
		double[] pontuacao = new double[5];
		
		Scanner entrada = new Scanner(System.in);
		double  maiorN = 0;
		int i;
		
		System.out.println("Digite as 5 pontuações: ");
		
		for( i = 0; i < pontuacao.length; i++) {
			pontuacao[i] = entrada.nextDouble();
			
			if (pontuacao[i] > maiorN) {
				maiorN = pontuacao[i];
			}
			
		}
		
		System.out.println("As pontuações digitas foram: ");
		for(i = 0; i < pontuacao.length; i++) {
			System.out.println(pontuacao[i]);
		}
			
		System.out.println("O maior número foi: " + maiorN);
		
		entrada.close();
	
	}
}
