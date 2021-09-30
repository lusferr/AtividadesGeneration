programa {
	
	inclua biblioteca Texto 
	
	funcao inicio() {
		inteiro contagem
		cadeia nomes [3]

		para (contagem = 0; contagem < 3; contagem++){

			escreva ("Digite o ", contagem + 1, "° nome: " )
			leia (nomes[contagem])
		}

		escreva ("\nNome: ")
		
		para (contagem = 0; contagem < 3; contagem++) {

			escreva (nomes[contagem] + ". ")

			nomes[contagem] = Texto.caixa_baixa(nomes[contagem])

			se (nomes[contagem] == "luis") {

				escreva ("Esse é o melhor nome")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */