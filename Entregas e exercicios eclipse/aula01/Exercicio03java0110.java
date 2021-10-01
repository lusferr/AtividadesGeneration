package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio03java0110 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int segundos, minutos, horas;
		
		System.out.println("Qual foi o tempo de duração do evento em segundos? ");
		segundos = leia.nextInt();
		
		minutos = segundos / 60;
		horas = (segundos / 3600);
	
		System.out.println("A duração em horas é igual a =>" + horas + " h");
		
		System.out.println("Ou em minutos é igual a =>" + minutos + " min");
		
		leia.close();
	}

}
