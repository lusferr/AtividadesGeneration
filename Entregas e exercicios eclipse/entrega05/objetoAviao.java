package br.com.generation.entrega05;

public class objetoAviao {

	public static void main(String[] args) {
		Aviao av1 = new Aviao();
		
		av1.modelo = "Jumbo";
		av1.tamanho = "Grande";
		av1.id = 5589;
		av1.velocidade = 0;
		
		av1.acelerar(3000);
		System.out.println("Identificação: " + av1.id);
		System.out.println("Modelo: " + av1.modelo);
		System.out.println("Tamanho: " + av1.tamanho);
		System.out.println("Velocidade em voo: " + av1.velocidade + "km/h");
		av1.frear(2000);
		System.out.println("Velocidade em trajetoria de pouso: " + av1.velocidade + "km/h");
		
				

	}

}
