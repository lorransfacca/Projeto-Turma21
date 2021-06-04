programa
{
	
	funcao inicio()
	{
	     inteiro numero
		inteiro vetor[3] = {1,2,3}
		inteiro valores[3][3]={{2,4,3},
                                 {6,9,1},
		                       {8,5,1}}
		escreva("Digite 1: ")
		leia(numero)
		                                        
		para(inteiro l=0; l<3; l++){
			para(inteiro c=0;c<3;c++){
			escreva(valores[l][0],",")
			}
			escreva("\n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */