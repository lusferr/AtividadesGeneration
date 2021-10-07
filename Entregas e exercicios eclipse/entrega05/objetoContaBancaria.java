package br.com.generation.entrega05;

public class objetoContaBancaria {

	public static void main(String[] args) {
		contaBancaria cb = new contaBancaria();
		
		cb.setNome("Gabriel");
		cb.setNmrC(18569);
		cb.setSaldo(0);
		
		cb.deposito(1000);
		System.out.println("Nome: " + cb.getNome());
		System.out.println("Número da conta: " + cb.getNmrC());
		System.out.println("Saldo após deposito: " + cb.getSaldo() + "R$");
		cb.saque(500);
		System.out.println("Saldo após saque: " + cb.getSaldo() + "R$");
		

	}

}
