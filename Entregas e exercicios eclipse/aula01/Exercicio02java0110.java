package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio02java0110 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idadeDias, idadeAnos, idadeMeses, totalDias; 
		
		System.out.println("Quantos dias de vida?");
		totalDias = leia.nextInt();
		
		idadeAnos = totalDias/365;
		
		idadeMeses = (totalDias%365) / 30;
		
		idadeDias = (totalDias%365) % 30;
		
		System.out.println("A idade em anos é -> " + idadeAnos);
		System.out.println("Meses -> " + idadeMeses);
		System.out.println("dias -> " + idadeDias);
		
		
		
		leia.close();
	}

}
