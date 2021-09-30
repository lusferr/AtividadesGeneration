programa {
	
	funcao inicio() {
		//LUIS FERNANDO DA SILVA
		//24/09/21
		
		real base, altura

		escreva ("Qual o tamanho da base do triangulo? ")
		leia (base)

		escreva ("Qual a altura do triangulo? ")
		leia (altura)

		se (base > 0 e altura > 0){
			escreva ("Valores validos - área do triângulo=" + (base * altura))
		}

		senao {
			escreva ("dados inseridos são invalidos, não possivel calcular")
		}
		


		  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 79; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */