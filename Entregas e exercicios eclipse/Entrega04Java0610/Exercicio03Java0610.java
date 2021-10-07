package br.com.generation.Entrega04Java0610;

import java.util.Scanner;

public class Exercicio03Java0610 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[][] matriz1 = new double[2][3];
		double[][] matriz2 = new double[2][3];
		double[][] matrizSoma = new double[2][3];
		double[][] matrizSub = new double[2][3];
		
		for(int l = 0; l < matriz1.length; l++) {
			for(int c = 0; c < matriz1[l].length; c++) {
				System.out.printf("Digite os valores da 1° matriz [%d %d]: ",l,c);
					matriz1[l][c] = entrada.nextDouble();
			}
		}	
		System.out.println();
		
		for(int l = 0; l < matriz2.length; l++) {
			for(int c = 0; c < matriz2[l].length; c++) {
				System.out.printf("Digite os valores da 2° matriz [%d %d]: ",l,c);
					matriz2[l][c] = entrada.nextDouble();
			}
		}
		System.out.println("\nmatrizSoma = matriz1 + matriz2");
		
		for(int l = 0; l < matriz1.length; l++) {
			for(int c = 0; c < matriz1[l].length; c++) {
				 matrizSoma[l][c] = matriz1[l][c] + matriz2[l][c];
				 System.out.printf("[" + matrizSoma[l][c] + "]");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("\nmatrizSub = matriz1 - matriz2 ");
		for (int l = 0; l < matriz2.length; l++) {
			for (int c = 0; c < matriz2[l].length; c++) {
				matrizSub[l][c] =  matriz1[l][c] - matriz2[l][c];
				System.out.printf("[" + matrizSub[l][c] + "]");
			}
			System.out.println();
		}
		
		
		entrada.close();
	}

}
