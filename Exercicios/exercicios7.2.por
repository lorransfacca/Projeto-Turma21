programa
{
	
	funcao inicio()
	{
	
		real indicePoluicao=0.00
		escreva("digite o indice de poluicao de hoje: ")
		leia(indicePoluicao)

		se(indicePoluicao <= 0.25 ou indicePoluicao <= 0.25){
			escreva("indice aceitavel")
		}
		senao se (indicePoluicao >= 0.3){
			escreva("industria do primeiro grupo, parem o trabalho")
		}
		senao se(indicePoluicao >= 0.4){
			escreva("industria do primeiro grupo e segundo grupo, parem o trabalho")
				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */