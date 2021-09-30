programa {
	
	inclua biblioteca Texto
	
	funcao inicio() {
		cadeia tecla = ""
		
		enquanto (tecla != "s" ) {
			
			escreva ("Tecle  [s] para sair. ")
			leia (tecla)

			tecla = Texto.caixa_baixa(tecla)
		}

		escreva ("\n Legal, acabamos de sair do bloco enquanto\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */