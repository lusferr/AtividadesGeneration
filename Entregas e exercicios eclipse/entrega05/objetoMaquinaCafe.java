package br.com.generation.entrega05;

public class objetoMaquinaCafe {

	public static void main(String[] args) {
		maquinaCafe m1 = new maquinaCafe();
		
		m1.cor = "Vermelha";
		m1.marca = "DolceGusto";
		m1.temperatura = 0;
		
		m1.quente(80);
		System.out.println("Cor da m�quina: " + m1.cor);
		System.out.println("Marca: " + m1.marca);
		System.out.println("Temperatura para caf�: " + m1.temperatura);
		m1.frio(70);
		System.out.println("Temperatura para ch�: " + m1.temperatura);

	}

}
