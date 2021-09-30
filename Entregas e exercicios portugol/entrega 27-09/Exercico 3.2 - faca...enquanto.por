programa {
	// LUIS FERNANDO DA SILVA - TURMA 35
	funcao inicio() {
		inteiro num, contador = 0, soma = 0 

		escreva ("Digite um número: ")
		leia (num)

		faca {
			se (contador < num) {
				contador ++

				soma = soma + contador
				
				escreva ("\n", contador)
								
			}
						
		} enquanto (contador < num)
		escreva ("\nSoma: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */