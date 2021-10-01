package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio01Java0110 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		int ano, mes, dia, anoAtual = 2021, total = 0;
		
		
		System.out.println("Qual o ano de nascimento? ");
		ano = leia.nextInt();
		
		System.out.println("\nMês: ");
		mes = leia.nextInt();
		
		System.out.println("\nDia: ");
		dia = leia.nextInt();
		
		total = (anoAtual - ano - mes/12 - dia/365)*365;
		
		System.out.println("Você tem aproximadamente " + total  + " dias de vida" );
		
		leia.close();
		
		
	}

}
