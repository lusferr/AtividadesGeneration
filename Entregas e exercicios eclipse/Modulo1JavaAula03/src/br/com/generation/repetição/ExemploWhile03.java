package br.com.generation.repeti��o;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) { // ---> Inicio do la�o de repeti��o - while
			System.out.println("Digite um n�mero: ");
			numero = in.nextInt();
			
			if(numero == 10) { // --> Inicio la�o condicional
				System.out.println("Voc� acertou!");
			}
			else {
				System.out.println("Voc� errou"); // --> Fim do la�o condicional
			}
		} // --> Fim do la�o ded repeti��o = while
		in.close();
	}
  
}
