programa{
	
	funcao inicio() {
		inteiro opc

		escreva ("[----- MENU PRINCIPAL -----]")
		escreva ("\n [ 1 ] SOMAR\n [ 2 ] SUBTRAIR\n [ 3 ] MULTIPLICADOR\n\n")

		escreva("Opção: ")
		leia(opc)

		escolha (opc){
			caso 1: 				//opçãp 1 - soamr
				escreva("\nOpção escolhida 1")
				pare

			caso 2:				//opção 2 - subtrair
				escreva("\nOpção escolhida 2")
				pare

			caso 3:				//opção 3 - multiplicar
				escreva("\nOpção escolhida 3")
				pare	

			caso contrario:
				escreva("Essa opção ainda não foi implementada")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */