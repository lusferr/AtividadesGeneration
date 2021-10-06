package br.com.generation.Entrega03Java0510;

public class Exercicio01Java0510 {

	public static void main(String[] args) {
		 int valor, contador = 0;
		 
		 for(valor = 1000; valor <= 1999; valor ++) {
			 contador ++;
			 
			 if (valor % 11 == 5) {
				 System.out.println( contador + "°" + " Valor: " + valor);	  
				 
			 }			 
			 			 			 
		 }

	}

}
