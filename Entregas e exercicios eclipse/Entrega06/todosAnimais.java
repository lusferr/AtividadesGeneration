package br.com.generation.Entrega06;

public class todosAnimais {

	public static void main(String[] args) {
		cachorro ca1 = new cachorro();
		cavalo cav1 = new cavalo();
		preguica pre1 = new preguica();
		
		ca1.setNome("Luke");
		ca1.setIdade(5);
		ca1.setTipo("Cachorro");
		ca1.setSom("Latido");
		ca1.setMovimento("Corre");
		
		cav1.setNome("Spirit");
		cav1.setIdade(12);
		cav1.setTipo("Cavalo");
		cav1.setSom("Relincha");
		cav1.setMovimento("Galopa");
		
		pre1.setNome("Bob");
		pre1.setIdade(15);
		pre1.setTipo("Bixo Preguiça");
		pre1.setSom("Gruni");
		pre1.setMovimento("Sobe em arvore");
		
		System.out.println("Espécie: " + ca1.getTipo());
		System.out.println("Nome: " + ca1.getNome());
		System.out.println("Idade: " + ca1.getIdade());
		System.out.println("Movimento: " + ca1.getMovimento());
		System.out.println("Som que faz: " + ca1.getSom());
		
		System.out.println();
		System.out.println("Espécie: " + cav1.getTipo());
		System.out.println("Nome: " + cav1.getNome());
		System.out.println("Idade: " + cav1.getIdade());
		System.out.println("Movimento: " + cav1.getMovimento());
		System.out.println("Som que faz: " + cav1.getSom());
		
		System.out.println();
		System.out.println("Espécie: " + pre1.getTipo());
		System.out.println("Nome: " + pre1.getNome());
		System.out.println("Idade: " + pre1.getIdade());
		System.out.println("Movimento: " + pre1.getMovimento());
		System.out.println("Som que faz: " + pre1.getSom());
		
		

	}

}
