package br.com.generation.Entrega03Java0510;

public class Exercicio02Java0510 {

	public static void main(String[] args) {
		int num = 0, contador = 0;
		
		for(num = 0; num <= 10; num++) {
			 contador++; 
			
			 if (num % 2 == 0) {
				 System.out.println(num+1 + "° Valor:" + " impar= " + contador);
			 }
			 else {
				 System.out.println(num+1 + "° Valor:" + " par= " + contador);
			 }
		}

	}

}
