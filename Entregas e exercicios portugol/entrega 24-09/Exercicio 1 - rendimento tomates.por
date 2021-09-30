programa {
	
	funcao inicio() {
		//LUIS FERNANDO DA SILVA
		//24/09/21
		
		inteiro pesoEstabelecido, multa, pesoTomates, excesso, valorTomates, multaExcesso

		pesoEstabelecido = 50
		multa = 4

		escreva ("Qual a quantidade em kh de tomates?")
		leia (pesoTomates)

		escreva ("Qual foi o valor pago? ")
		leia (valorTomates)

		se (pesoTomates <= pesoEstabelecido) {
			escreva ("valor total de tomates = " + pesoTomates*valorTomates )
			
		}

		senao se (pesoTomates > pesoEstabelecido) {

			excesso = (pesoTomates - pesoEstabelecido) 
			multaExcesso = (excesso * 4)
			escreva("Peso ultrapassou, o valor será acrescido uma multa por kg em excesso.")
			escreva("\nSeu excesso foi de: " + excesso + "kg. \ne o valor da multa de: " + multaExcesso)
			escreva("\n\nvalor total de tomates = " + (multaExcesso + pesoTomates*valorTomates))
			 								
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 74; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */