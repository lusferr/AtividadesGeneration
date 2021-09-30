programa {
	
	funcao inicio() {
		//LUIS FERNANDO DA SILVA
		//24/09/21
		
		inteiro idade
		
		escreva ("Qual a sua idade? ")
		leia (idade)

		se (idade > 13 e idade < 18)
		escreva ("Categoria - Juvenil A")

		senao se (idade > 11 e idade < 14)
		escreva ("Categoria - Juvenil A")

		senao se (idade > 7 e idade < 12){
			escreva ("Categoria - Infantil B")
		}

		senao se (idade > 4 e idade < 8) {
			escreva ("Categoria - Infantil A")
		}

		senao {
			escreva("Categoria - Adultos")
		}
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */