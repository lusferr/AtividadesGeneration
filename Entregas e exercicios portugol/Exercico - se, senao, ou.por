programa {
	
	funcao inicio() {
	
		inteiro idade
		cadeia nome, resposta

		escreva ("Digite seu nome: ")
		leia(nome)

		escreva ("Digite sua idade: ")
		leia(idade)

		se (idade >= 18 e idade <= 60) {							//entre 18 e 60
			escreva ("\nOk " + nome + ", vamos prosseguir...\n\n")
		}

		senao se (idade >= 16 e idade < 18 ) {						//16 ou 17
			escreva (nome + " você tem autorização? [s / n] ")
			leia (resposta)

			se (resposta == "s" ou resposta == "S") {
				escreva("Legal, vamos prosseguir")
			}

			senao se (resposta == "n" ou resposta == "N"){
				escreva("Volte quando conseguir sua autorização")
			}

			senao {
				escreva ("Dado inválido")
			}
		}
		
		
		senao se (idade < 16 e idade >= 0) {						//0 e 15 
			escreva ("\nOps," + nome + " não podemos prosseguir")
		}

		senao se (idade > 60 e idade <= 110) {						//entre 61 e 110
			escreva("Ops," + nome + " não podemos prosseguir")
		}

		senao {
			escreva ("Dado inválido")	
		}

			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 36; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */