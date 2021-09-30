programa {
	
	inclua biblioteca Matematica --> mat

	//calcular a media de 4 notas
	funcao inicio() {

		real nota, media, soma = 0.0
		inteiro contador=0

		enquanto (contador < 4) {
			escreva ("Digite a " + (contador+1) + " nota: ")
			leia (nota)

			soma = soma + nota
			//soma += nota

			contador = contador + 1
			//contador ++
		}
		
		escreva ("\nMédia fina: " + soma/4 + "\n\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */