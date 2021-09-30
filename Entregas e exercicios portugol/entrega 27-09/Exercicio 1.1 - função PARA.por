programa  {
	// LUIS FERNANDO DA SILVA - TURMA 35
	funcao inicio() {
		inteiro habitantes, numeroFilhos, contador, resultado, somaFilhos = 0, codMS = 0
		real salario =  0.0, somaSalario = 0.0, maiorSalario = 0.0, contMenorSalario = 0.0 

		escreva ("Qual o número de habitantes a ser analisado? ")
		leia (habitantes)

		para (contador = 1; contador <= habitantes; contador++) {
			escreva ("\nDigite o sálario do ", contador, ":")
			leia (salario)

			escreva ("\nDigite o número de filhos: \n")
			leia (numeroFilhos)


			se (salario <= 100) {
				contMenorSalario++
				codMS = contador
			}

			se (maiorSalario < salario) {
				maiorSalario = salario
			}

			somaSalario = salario + somaSalario      //somaSalario += salario
			somaFilhos = numeroFilhos + somaFilhos   //somaFihlos += numeroFilhos
				
		}
		
		limpa ()
		escreva ("---------------------RELATÓRIO-----------------------")
		escreva ("\nA média salárial da população é....................: R$" + somaSalario/habitantes)
		escreva ("\nA média de número de filhos é......................: " + somaFilhos/habitantes)
		escreva ("\nO maior salário é de ..............................: R$" + salario)
		escreva ("\nCódigo da pessoa...................................: " + codMS)
		escreva ("\nO percentual de pessoas que recebem menos de R$100.: ", ((contMenorSalario/habitantes)*100), "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */