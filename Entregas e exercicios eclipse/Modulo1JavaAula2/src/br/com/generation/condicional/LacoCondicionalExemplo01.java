package br.com.generation.condicional;

import java.util.Scanner;

public class LacoCondicionalExemplo01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1° nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a 2° nota: ");
		nota2 = ler.nextDouble();

		media = (nota1 + nota2) / 2;		
		
		// Laços condicionais
	   if (media >= 6.0) {
		   System.out.println("Aprovado.\nMédia" + media);
	   }
	   
	   else if(media >= 3.0 && media < 6.0) {
		   System.out.println("Recuperação. \nMédia: " + media);
	   }
	   
	   else {
		   System.out.println("Reprovado.\nMédia: " + media);
	   }
	   
	   ler.close();
				
	}

}
