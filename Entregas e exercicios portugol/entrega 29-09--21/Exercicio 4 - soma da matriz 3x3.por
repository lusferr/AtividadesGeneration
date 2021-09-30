programa {
	//LUIS FERNANDO DA SILVA TURMA 35  ---- 29/09/21
	funcao inicio() {
		inteiro linha, coluna, matriz[3][3], somaG = 0, somaD = 0

		para (linha = 0; linha < 3; linha++ ) {
			para (coluna = 0; coluna < 3; coluna++) {
				escreva ("Posição [", linha+1, "][" ,coluna+1 , "]")
				leia (matriz[linha][coluna])
			}
		}


		para (linha = 0; linha < 3; linha++) {
			para (coluna = 0; coluna < 3; coluna++) {
				escreva (matriz[linha][coluna])								
			}					
		escreva ("\n")		
		}
		//soma = matriz[1][1] + matriz[2][2] + matriz[3][3]

		para (linha= 0; linha <3; linha++) {
			para (coluna = 0; coluna < 3; coluna++) {
				somaG += matriz[linha][coluna] //aqui ele esta somando todos os valores preenchidos
				
				se (linha == coluna) {
					somaD += matriz[linha][coluna]
				}
			}
		}

		escreva ("\nSomando diagonal principal: ", somaD)
		escreva ("\nSomando todos os valores: ", somaG)
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