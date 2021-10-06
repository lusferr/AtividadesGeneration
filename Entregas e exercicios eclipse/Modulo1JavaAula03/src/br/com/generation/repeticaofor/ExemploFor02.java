package br.com.generation.repeticaofor;

public class ExemploFor02 {

	public static void main(String[] args) {
		
		int n = 5;
		int i, soma; 

		for(i = 0, soma = 0; i <= n; i++) {
			
			System.out.print("soma= " + soma + " + " + i);
			
			soma += i;
			
			System.out.println(" = " + soma);
		}
	}

}
