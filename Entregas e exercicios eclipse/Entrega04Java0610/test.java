package br.com.generation.Entrega04Java0610;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in);){
            double[] notas = new double[4];
            double soma = 0.0, media = 0.0;
            int i;

            System.out.println("Digite às 4 notas do Aluno: ");

            for (i = 0; i < notas.length; i++) {
                notas[i] = entrada.nextDouble();
                soma += notas[i]; // soma = soma + notas[i]
                media = soma / notas.length;
            }

            System.out.println("Média: " + media);
        }
        catch(Exception e){

        }

	}

}
