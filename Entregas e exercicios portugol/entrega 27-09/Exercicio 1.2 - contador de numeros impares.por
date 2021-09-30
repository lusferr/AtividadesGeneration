programa {
	// LUIS FERNANDO DA SILVA - TURMA 35
	inclua biblioteca Matematica
	funcao inicio() {
		inteiro contador, soma = 0

		para (contador = 0; contador <= 500; contador += 3) {
			escreva ("\n", contador)
	
			se (contador % 2 != 0){
				soma = soma + contador 
			}
		
		}
		escreva (contador)
		escreva ("\n" + soma)
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */