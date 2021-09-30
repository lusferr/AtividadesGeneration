programa {
	//LUIS FERNANDO DA SILVA TURMA 35  ---- 29/09/21
	funcao inicio() {
		inteiro valor[10], contagem, maiorD = 0, num = 0, qntMaior = 0, soma = 0

		para (contagem = 0; contagem < 10; contagem++) {
			escreva("\nDigite o " , contagem + 1 , "° valor:")
			leia (num)

			enquanto (num < 1 ou num > 6) {
				escreva ("Valor invalido")

				escreva ("\nDigite o " , contagem + 1 , "° valor:")
				leia(num)
			}

			valor[contagem] = num
			soma += valor[contagem]

			se(valor[contagem] >= maiorD){
				qntMaior++
				maiorD = valor[contagem]
			}
			
		}

		escreva ("\nA soma dos valores foi: " , soma)
		escreva ("\nO maior valor foi de: " , maiorD , " e ele se repetiu: " , qntMaior)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 704; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */