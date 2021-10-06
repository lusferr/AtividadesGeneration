package br.com.generation.repetição;

public class ExemploWhile {

	public static void main(String[] args) throws InterruptedException {
		int contador = 0;
		
		while (contador <= 10) { //inicio do laço
			
			System.out.println("Repetição...nr :" + contador);
			contador++;
			Thread.sleep(1000); //--> 1000 milisegundos = 1 segundo
			
		}          				 // fim do laço 

	}

}
