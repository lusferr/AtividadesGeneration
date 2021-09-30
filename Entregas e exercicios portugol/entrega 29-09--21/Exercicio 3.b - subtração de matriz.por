programa {
	//LUIS FERNANDO DA SILVA TURMA 35  ---- 29/09/21
	funcao inicio() {
		inteiro linha, coluna, priMatriz[4][6], segMatriz[4][6]

		para (linha = 0; linha < 4; linha++){
			para (coluna = 0; coluna < 6; coluna++) {
				
				escreva ("1° Matriz - posição [" , linha + 1 ,"][", coluna + 1 , "]")
				
				leia (priMatriz[linha][coluna])
				
			}
			escreva ("\n")			
		}

		limpa()

		para (linha = 0; linha < 4; linha++ ) {
			para (coluna = 0; coluna < 6; coluna++) {

				escreva (priMatriz[linha][coluna])
			}
			escreva ("\n")
		}

		para (linha = 0; linha < 4; linha++) {
			para (coluna = 0; coluna < 6; coluna++) {

				escreva ("2° Matriz - posição [" , linha + 1 ,"][" ,  coluna + 1, "]")
				leia (segMatriz[linha][coluna])
			}
			escreva ("\n")
		}

		para (linha = 0; linha < 4; linha++) {
			para (coluna = 0; coluna < 6; coluna++){
				escreva ((priMatriz[linha][coluna]) - (segMatriz[linha][coluna]))
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
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */