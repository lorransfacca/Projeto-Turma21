programa 
{
	funcao inicio()
	{
		caracter nome,sexo
		inteiro idade
	     real p, a, imc
	     cadeia msg
	     escreva("Cálculo do IMC\n")
	     escreva("digite seu nome:\n")
	     leia(nome)
	     escreva("digite seu idade:\n")
	     leia(idade)
	     escreva("digite seu Genero:\n")
	     leia(sexo)
		escreva("digite seu peso:\n")
		leia(p)
		escreva("digite sua altura:\n")
		leia(a)
		imc = p/ (a * a)
		msg = "resultado: "
		se(imc < 18.5)
		{
			msg += "magreza "
			se(imc >=17)
			{
				msg += "leve"
			}
			se(imc < 17 e imc >= 16)
			{
				msg += "moderada"
			}
			se(imc >=16)
			{
				msg += "severa"
			}
			se(imc >=18.5 e imc < 25)
			{
				msg += "peso normal"
			}
			se(imc >= 25 e imc < 30)
			{
				msg += "sobrepeso"
			}
			se(imc >= 30)
			{
				msg += "obesidade"
				se(imc < 35)
				{
					msg += "classe I"
				}
				se(imc >= 35 e imc < 40)
				{
					msg += "classe II"
				}
				se(imc >= 40)
				{
					msg += "classe III"
				}
			}
			escreva(msg, "- IMC =", imc)
			
		}
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1009; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */