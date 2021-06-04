programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	    /*8. O custo ao consumidor de um carro novo é a soma 
	    do custo de fábrica com a percentagem do distribuidor 
	    e dos impostos (aplicados ao custo de fábrica). 
	    Supondo que a percentagem do distribuidor seja de 28% 
	    e os impostos de 45%, escrever um sistema que leia o
	    custo de fábrica de um carro e escreva o custo ao 
	    consumidor. */
	     
	     const real pdistribuidor = 0.28, pimposto = 0.45
	     
	     real custoConsumidor = 0.00, percentagemDistribuidor = 0.00, impostos = 0.00, custofabrica = 0.00

	     escreva("digite o custo de fabrica do carro: R$")
	     leia(custofabrica)

	     percentagemDistribuidor = mat.arredondar((custofabrica * pdistribuidor),2)
	     impostos = custofabrica * pimposto
	     custoConsumidor = custofabrica + percentagemDistribuidor + impostos

	     escreva("Passat- carro véio!!!\n")
	     escreva("cnpj0001.001630.21358\n")
	     escreva("\n")
	     escreva("custo de fabrica: R$" +custofabrica+"\n")
	     escreva("distribuido R$" +percentagemDistribuidor+"\n")
	     escreva("impostos R$"+impostos+"\n")
	     escreva("custo consumidor R$"+custoConsumidor+ "\n")
	     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */