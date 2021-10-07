package br.com.generation.entrega05;

public class objetoCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		c1.setNome("Luis Fernando");
		c1.setId(4567);
		c1.setIdade(22);
		c1.setTelefone(100009);
		c1.setSaldo(0);
		
		c1.comprar(100);
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Identificação: " + c1.getId());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Tel: " + c1.getTelefone());
		
		
		System.out.println("Valor de saldo após a compra: " + c1.getSaldo());
		

	}

}
