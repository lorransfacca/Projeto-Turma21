programa
{
	
	funcao inicio()
	{
		/*Faça um sistema que leia o tempo de duração de um 
		 * evento em uma fábrica expressa em segundos e 
		 * mostre-o expresso em horas, minutos e segundos.
*/
	
	inteiro tempoDuracao,horas,minuntos,segundos

	escreva("Digite o tempo do evento em segundo: ")
	leia(tempoDuracao)

	horas = (tempoDuracao / 3600)
	minuntos = (tempoDuracao % 3600) / 60
	segundos = (tempoDuracao % 3600) % 60

	escreva("horas: "+horas+"\n")
	escreva("minuntos: "+minuntos+"\n")
	escreva("segundos: "+segundos+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */