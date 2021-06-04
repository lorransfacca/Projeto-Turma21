programa{
   
  funcao inicio(){
    inteiro l, c, A[3][3] = {{10,11,12},{20,21,22},{30,31,32}}
    inteiro C[3][3], B[3][3] = {{30,31,32},{40,41,42},{50,51,52}}

    para(l = 0; l < 3+3; l++){
      para(c = 0; c < 3; c++){
        C[l][c] = A[l][c] + B[l][c]
      }
    }

    para(l = 0; l < 3; l++){
      para(c = 0; c < 3; c++){
        escreva(C[l][c], " ")
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
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */