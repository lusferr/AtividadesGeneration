programa {
	//EXERCICIO 6
	inclua biblioteca Matematica --> mat
	funcao inicio() {
		
		real p1, p2, x1, x2, y1, y2, d, radicando

		escreva ("Escreva as coordenadas do primeiro ponto: ")
		
		escreva ("\nPrimeiro número: ")
		leia (x1)
		
		escreva ("\nSegundo número: ")
		leia (y1)
		
		escreva ("Escreva as coordenadas do segundo ponto: ")
		
		escreva ("\nPrimeiro número: ")
		leia (x2)

		escreva ("\nSegundo número: ")
		leia (y2)


		radicando = (((x2 - x1) * 2) + ((y2 - y1) * 2))
		d = mat.raiz(radicando, 2.0)

		escreva ("o resultado é: " + d)




		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */