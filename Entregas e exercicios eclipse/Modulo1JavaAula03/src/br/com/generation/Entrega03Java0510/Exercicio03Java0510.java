package br.com.generation.Entrega03Java0510;

import java.util.Scanner;

public class Exercicio03Java0510 {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, contador = 0, menor21 = 0, maior50 = 0;
		
		System.out.println("Digite a " + (contador+1) + "° idade: ");
		idade = ler.nextInt();
		
		while (idade != 99 ) {
			contador++;
			
			
			if (idade <= 21) {
				menor21 ++;
			}
			
			if (idade >= 50) {
				maior50++;	
			}
			
			System.out.println("Digite a " + (contador+1) + "° idade ou -99 para encerrar. ");
			idade = ler.nextInt();
			
		}
		System.out.println("Programa encerrado!");
		System.out.println("Nmr de pessoas de até 21 anos: " + menor21);
		System.out.println("Nmr de pessoas maiores de 50 anos: " + maior50);
		
		ler.close();
	}

}
