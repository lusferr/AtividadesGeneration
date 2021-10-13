package br.com.generation.entrega07;

public class imprimirAnimais {

	public static void main(String[] args) {
		TesteAnimal anms = new TesteAnimal();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setIdade(5);
		cachorro.setNome("Luke");
		
		cavalo.setIdade(15);
		cavalo.setNome("Spirit");
		
		preguica.setNome("Brooo");
		preguica.setIdade(30);
		
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		System.out.print("Ação: ");
		anms.acaoAnimal(cavalo);
		System.out.print("Som: ");
		anms.somAnimal(cavalo);
		System.out.println();
		
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		System.out.print("Ação: ");
		anms.acaoAnimal(cachorro);
		System.out.print("Som: ");
		anms.somAnimal(cachorro);
		System.out.println();
		
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade());
		System.out.print("Ação: ");
		anms.acaoAnimal(preguica);
		System.out.print("Som: ");
		anms.somAnimal(preguica);
		System.out.println();

	}

}
