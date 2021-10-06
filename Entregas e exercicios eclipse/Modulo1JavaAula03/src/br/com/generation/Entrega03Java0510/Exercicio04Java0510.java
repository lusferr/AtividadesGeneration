package br.com.generation.Entrega03Java0510;

import java.util.Scanner;

public class Exercicio04Java0510 {

	public static void main(String[] args) {
		int idade, sexo, humor, pessoas = 0 ,pessoasNervosas = 0, pessoasCalmas = 0, pessoasAgressivas = 0, velhosNervosos = 0, jovensCalmos = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os dados da " + (pessoas+1) + "°.");
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		System.out.println("Digite o sexo: [1]homem, [2]mulher, [3]outros ");
		sexo = entrada.nextInt();
		System.out.println("Digite o humor: [1]calmo, [2]nervoso, [3]agressivo");
		humor = entrada.nextInt();
	
		while (pessoas <= 5) {
			pessoas++;
			
			if (humor == 1) {
				pessoasCalmas++;
			}
			
			if (humor == 2 && sexo == 2) { //mulheres nervosas
				pessoasNervosas++;			
			}
			if (humor == 3 && humor == 3) { //homens agressivos
				pessoasAgressivas++;
			}
			
			if (idade >= 40 && humor == 2) { //pessosas nervosas com mais de 40
				velhosNervosos++;
			}
			if (idade <= 18 && humor == 1) {//menores de 18 calmos
				jovensCalmos++;
			}
			
			System.out.println("Digite os dados da " + (pessoas+1) + "°.");
			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();
			System.out.println("Digite o sexo: [1]homem, [2]mulher, [3]outros");
			sexo = entrada.nextInt();
			System.out.println("Digite o humor: [1]calmo, [2]nervoso, [3]agressivo");
			humor = entrada.nextInt();
									
		}
		
		System.out.println("O número de mulheres nervosas foi: " + pessoasNervosas);
		System.out.println("O número de homens agressivos foi: " + pessoasAgressivas);
		System.out.println("O número de pessoas nervosas com mais de 40 foi: " + velhosNervosos);
		System.out.println("O número de jovens calmos foi: " + jovensCalmos);
		System.out.println("O número de outras pessoas calmas foi: " + pessoasCalmas);
		
		entrada.close();

	}

}
