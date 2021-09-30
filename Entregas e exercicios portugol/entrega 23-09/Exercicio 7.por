programa {
	//Exercicio 7 - escreva um algoritmo que lê os coeficientes a,b, c, d, g e f E calcule os valores de x e y
	funcao inicio() {
		
		real a, b, c, d, f, g, x, y

		escreva("Digite o valor de a: ")
		leia (a)
		
		escreva("Digite o valor de b: ")
		leia (b)
		
		escreva("Digite o valor de c: ")
		leia (c)
				
		escreva("Digite o valor de d: ")
		leia (d)
			
		escreva("Digite o valor de g: ")
		leia (g)

		escreva("Digite o valor de f: ")
		leia (f)
		

		x = ((c*g) - (b*f)) / ((a*g) - (b*d)) 

		y = ((a*f) - (c*d)) / ((a*g) - (b*d))

		escreva ("X é igual a: " + x)
		escreva ("\nY é igual a: " + y)

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */