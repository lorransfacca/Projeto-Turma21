programa 
{
	funcao inicio()
	/*-Até 18 anos, jovem
-Acima de 18 até 50, adulto(a)
-Acima de 50, idoso(a)
*/
	{
		caracter genero
		inteiro idade
	     cadeia nome,msg
	     escreva("digite seu nome:\n")
	     leia(nome)
	     escreva("digite seu idade:\n")
	     leia(idade)
	     escreva("digite seu genero:\n")
	     leia(genero)
	     msg = " Status: "
	
			se(idade <=18)
			{
				msg += "jovem"
			}
			se(idade <= 50)
			{
				msg += "adulto"
			}
			 se(idade >= 60)
			{
				msg += "idoso"	
			}
			escreva("Nome: "+nome+ " Idade: " , idade," anos",msg)
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */