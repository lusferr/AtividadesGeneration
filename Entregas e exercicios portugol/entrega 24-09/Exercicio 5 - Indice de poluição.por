programa{
	
	funcao inicio(){
		//LUIS FERNANDO DA SILVA
		//24/09/21
		
		real indicePoluicao, indiceAceitavel, grupo

		
		escreva ("A qual grupo a empresa pertence? [1] [2] [3] " ) 
		leia (grupo)

		escreva ("Qual foi o indice de poluição? \n")
		leia (indicePoluicao)

		se (indicePoluicao < 0.25 ){
			escreva ("O trabalho pode continuar")
			
		}
		
		senao se (indicePoluicao >= 0.5){
			escreva ("Todos os grupos de empresas devem parar")
		}
		
		senao se (indicePoluicao >= 0.4){
			escreva ("As empresas do grupo 1 e 2 devem parar")
		}

		
		senao se (indicePoluicao >+ 0.3){
			escreva ("As empresas do grupo 1 devem parar")
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 72; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */