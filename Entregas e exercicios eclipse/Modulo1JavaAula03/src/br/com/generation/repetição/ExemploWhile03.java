package br.com.generation.repetição;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) { // ---> Inicio do laço de repetição - while
			System.out.println("Digite um número: ");
			numero = in.nextInt();
			
			if(numero == 10) { // --> Inicio laço condicional
				System.out.println("Você acertou!");
			}
			else {
				System.out.println("Você errou"); // --> Fim do laço condicional
			}
		} // --> Fim do laço ded repetição = while
		in.close();
	}
  
}
