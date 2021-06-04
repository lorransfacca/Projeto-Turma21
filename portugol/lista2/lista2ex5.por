/*
 * 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
 * O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem 
 * suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a 
 * suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
 */

programa {
	funcao inicio() {
		real indicePoluicao = 0.00

		escreva("Digite o indíce de poluição: ")
		leia(indicePoluicao)

		se (indicePoluicao >= 0.5) {
			escreva("Indústrias de todos os grupos, parem o trabalho.")
		}
		senao se (indicePoluicao >= 0.4) {
			escreva("Indústrias do primeiro e segundo grupo, parem o trabalho.")
		}
		senao se (indicePoluicao >= 0.3) {
			escreva("Indústrias do primeiro grupo, parem o trabalho.")	
		}
		senao {
			escreva("Índice aceitável.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1127; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */