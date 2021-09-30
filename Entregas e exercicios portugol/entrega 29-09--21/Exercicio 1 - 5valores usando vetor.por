programa {
	//LUIS FERNANDO DA SILVA TURMA 35  ---- 29/09/21
	funcao inicio() {
		inteiro num [5], contagem, maior = 0 

		para (contagem = 0; contagem < 5; contagem++){

			escreva ("Digite o ", contagem+1 ,"° valor de pontuação: ")
			leia (num[contagem])

			se (num[contagem] > maior) {
				maior = num[contagem]
				
			}			
			
		}
		escreva ("O maior valor é: " , maior)
						
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */