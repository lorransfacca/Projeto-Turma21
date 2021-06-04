programa
{
     /*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
	
	funcao inicio()
	{
	     inteiro idade,anos,mes,dia,ano
	     caracter d,m,a
      	escreva ("dia de nascimento: /n")
          leia (d)
          escreva ("mes de nascimento: /n")
          leia (m)
          escreva ("ano de nascimento: /n")
          leia (a)

          escreva ("dia atual: /n")
          leia (dia)
          escreva ("mes atual: /n")
          leia (mes)
          escreva ("ano atual: /n")
          leia (ano)

          dia = dia*360


          escreva ("a pessoa possui:" + dia + mes + ano + "dias de vida")
      }
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */