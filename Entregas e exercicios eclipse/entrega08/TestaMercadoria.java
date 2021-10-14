package br.com.generation.entrega08;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaMercadoria {

	public static void main(String[] args) {
		
		int qR;
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<mercadoria> mercadoria = new ArrayList<mercadoria>();
		
		System.out.println("Quantas mercadorias vão ser add: ");
		int numeroP = sc.nextInt();
		
		for(int i = 0; i < numeroP; i++) {
			System.out.println("Nome da mercadoria: ");
			String nome = sc.next();
			
			sc.nextLine();
			
			System.out.println("Código: ");
			int cdg = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Qual o valor R$: ");
			int valor = sc.nextInt();
			
			mercadoria.add(new mercadoria(nome, cdg, valor));
		}
		
		for(mercadoria i : mercadoria) {
			System.out.println(i);
		}
		
		System.out.println("Deseja remover algo?\nResponda com: [0]-sim  [1]-não");
		int parar = sc.nextInt();
		
		if (parar == 0) {
			System.out.println("Tamanho da lista " + mercadoria.size() + "\nQual item deseja remover?Lembre-se, a lista começa em 0");
			qR = sc.nextInt();
			
			mercadoria.remove(qR);
			
			for(mercadoria i : mercadoria) {
				System.out.println("Lista atualizada: \n" + i);
			}
		}
		else if (parar == 1) {
			System.out.println("Programa finalizado!");
		}
		else {
			System.out.println("Ops! Opção inválida, programa finalizado :C");
		}
		
		sc.close();
	}

}
