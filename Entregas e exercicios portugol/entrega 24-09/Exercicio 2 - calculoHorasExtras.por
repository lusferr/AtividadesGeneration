programa {
	
	funcao inicio() {
		//LUIS FERNANDO DA SILVA
		//24/09/21
		
		inteiro c, n, ganhoHora, excesso, salario, tempoPadrao, ganhoHoraExtra

		ganhoHora = 10
		ganhoHoraExtra = 20
		tempoPadrao = 50

		escreva("Qual o código do funcionario? ")
		leia (c)

		escreva("Qual foi o número de horas trabalhadas? ")
		leia (n)
		
		se (n < 0){
			escreva ("Dado inválido.")
		}
		
		senao se (n <= 50) {
			salario = ((ganhoHora * n))
			excesso = 0
			escreva ("Seu salário é de R$" + salario)
		}

		senao se (n > 50){
			salario = ((ganhoHora * n))
			excesso = (n - tempoPadrao)

			escreva ("\nVocê obteve ganhos extras. \n Seu salário base é de R$" + salario)
			escreva ("\n ganhos extra R$" + (excesso * ganhoHoraExtra))
			escreva ("\n\nSalário total R$" + (salario +(excesso * ganhoHoraExtra)) )
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