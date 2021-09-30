programa {
	
	inclua biblioteca Util
	
	funcao inicio() { // tabuada teste

		inteiro contador, numero, resultado, cont = 0, opc = 0

		/*escreva ("Digite um número: ")
		leia (numero)*/

		enquanto (opc != 2){

			escreva ("\n\n [1] Criar novamente\n [2] Sair do sistema\nOpção: ")
			leia (opc)

			se (opc == 1) {
				escreva ("Digite um número: ")
				leia (numero)

				limpa()

				para (contador = 1; contador <= 10; contador++) {

				resultado = numero * contador
			
				escreva("\n" + numero + " X " + contador + " = " + resultado + "\n")
		 		}
			}

		 	senao se (opc == 2) {
				
				limpa ()

				escreva ("\n...sistema está sendo encerrado...")

				Util.aguarde(2000)
				
				escreva ("\n	Sistema encerrado")

				cont = 2
			
		 	}
		 	senao {
		 		limpa()
		 		escreva("Opçãp invalida.")
		 	}
		
		}
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 689; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */