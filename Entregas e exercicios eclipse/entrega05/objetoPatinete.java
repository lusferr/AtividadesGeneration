package br.com.generation.entrega05;

public class objetoPatinete {

	public static void main(String[] args) {
		patinete pa = new patinete();
		
		pa.cor = "Azul";
		pa.tamanho = "Médiano";
		pa.recomendado = 10;
		pa.velocidade = 0;
		
		System.out.println("Cor: " + pa.cor);
		System.out.println("Tamanho do patinete: " + pa.tamanho);
		System.out.println("Recomendado para idade:" + pa.recomendado + "anos");
		pa.andando(15);
		System.out.println("Velocidade máxima: " + pa.velocidade + "km/h");
		pa.parada(15);
		System.out.println("Velocidade após freiar: " + pa.velocidade + "km/h");

	}

}
