package br.com.generation.repeticaofor;

public class ExemploFor {

	public static void main(String[] args) throws InterruptedException {
		
		// variavel startada / condicional / incremento ou decremento
		
		for (int i = 0; i <= 21; i += 3) { // --> Inicio do la�o
			System.out.println("Repeti��o.. nr: " + i);
			Thread.sleep(800);
		} // --> Fim do la�o

	}

}
