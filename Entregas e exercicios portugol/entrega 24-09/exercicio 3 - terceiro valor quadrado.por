programa {
	
	funcao inicio() {
		//LUIS FERNANDO DA SILVA
		//24/09/21
		
		inteiro num1, num2, num3, num4, num1q, num2q, num3q, num4q

		escreva ("Digite o primeiro valor: ")
		leia (num1)

		escreva ("Digite o segundo valor: ")
		leia (num2)

		escreva ("Digite o terceiro valor: ")
		leia (num3)

		escreva ("Digite o quarto valor: ")
		leia (num4)
		
		num1q = (num1 * num1)
		num2q = (num2 * num2)
		num3q = (num3 * num3)
		num4q = (num4 * num4)

		se (num3q >= 1000){
			escreva ("Esse é o valor quadrado do 3 número " + num3q)		
		}

		senao {
			escreva("Esses são os respectivos valores quadrados dos números inseridos: \n\n")
			escreva("\n" + num1q)
			escreva("\n" + num2q)
			escreva("\n" + num3q)
			escreva("\n" + num4q)
			
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