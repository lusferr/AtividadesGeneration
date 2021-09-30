programa {

		/*
		
		[1.1] [1.2] [1.3]
		[2.1] [2.2] [2.3]
		[3.1] [3.2] [3.3]
			
		*/

	funcao inicio() {

		inteiro linha, coluna
		cadeia tabuleiro[3][3]

		para (linha = 0; linha < 3; linha++) {

			para (coluna=0; coluna < 3; coluna++) {

				escreva ("Posição: [" , linha+1 , "][", coluna+1 , "]" )
				leia (tabuleiro[linha][coluna])
				
			}
		}

		limpa()

		para (linha = 0; linha < 3; linha++){

			para (coluna = 0; coluna < 3; coluna++){

				escreva("[" , tabuleiro[linha][coluna] , "]" )

				
				
			}
			escreva ("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */