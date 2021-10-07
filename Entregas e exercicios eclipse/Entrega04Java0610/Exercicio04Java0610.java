package br.com.generation.Entrega04Java0610;

import java.util.Scanner;

public class Exercicio04Java0610 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		double somaMatriz = 0, somaDiagonal = 0;
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite os valores da matriz [%d %d]: ",l,c);	 
				 matriz[l][c] = entrada.nextDouble();
			}
		}
		System.out.println();
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				 System.out.printf("[" + matriz[l][c] + "]");
			}
			System.out.println();
		}
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				somaMatriz += matriz[l][c];
				
				if (l == c) {
					somaDiagonal += matriz[l][c];
				}
			}
			System.out.println();
		}
		System.out.println("A soma da matriz é: " + somaMatriz);
		System.out.println("A soma da diagonal principal é: " + somaDiagonal);
	}

}
