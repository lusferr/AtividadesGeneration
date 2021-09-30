programa
 {
	
	funcao inicio()
 {
		//EXERCICIO 1
		real anos, meses, dias, anoAtual, anoNascimento, total, mesAtual

		anoAtual = 2021
		mesAtual = 9

		escreva ("Em que ano você nasceu? ")
		leia (anoNascimento)

		escreva ("\nEm que mês?")
		leia (meses)

		escreva ("\nqual o dia?")
		leia (dias)

		total = ( anoAtual - anoNascimento - meses/12 - dias/365 )
		escreva ("Você tem aproximadamente " + total*365 + " dias vividos.")






		

		
				
		

		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 431; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */