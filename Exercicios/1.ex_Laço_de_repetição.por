programa
{

    funcao inicio()
    {

        real salario = 0.0,filhos = 0.0,mediasalario = 0.0,mediafilhos = 0.0,maiorsalario = 0.0,somasalario = 0.0,somafilhos = 0.0
        inteiro cont = 0


        para (inteiro x=0; x<20; x++){
            escreva("Informe seu salário:")
            leia(salario)
            escreva("Informe seu número de filhos:")
            leia(filhos)
            somasalario = somasalario + salario
            somafilhos = somafilhos + filhos
            se(salario>maiorsalario)
                maiorsalario = salario
            se(salario<=100)
                cont++
        }
        cont = (100*cont)/20
        mediasalario = somasalario/20
        mediafilhos = somafilhos/20
        escreva("\nmédia de salários: ",mediasalario)
        escreva("\nmédia de filhos: ",mediafilhos)
        escreva("\nMaior salário: ",maiorsalario)
        escreva("\nPercentual de pessoas com salário até R$100,00.: %",cont)

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 714; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */