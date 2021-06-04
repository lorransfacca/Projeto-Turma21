package classes;

public class Matematica extends Materia {

	public Matematica(double nota, int faltas, char op) {
		super(nota, faltas, op);
	}

	@Override
	protected char engajamento() {
		if (super.getNota() >= 8.0 && super.getFaltas() <= 5) {
			return 'B';
		} else if (super.getNota() >= 8.0 && super.getFaltas() > 5) {
			return 'b';
		} else if (super.getNota() >= 6.0 && super.getFaltas() <= 10) {
			return 'M';
		} else if (super.getNota() >= 6.0 && super.getFaltas() > 10) {
			return 'm';
		} else if (super.getNota() < 6.0 && super.getFaltas() > 10) {
			return 'R';
		} else {
			return 'r';
		}
	}

	@Override
	public void imprimirListaSugestoes() {
		if (engajamento() == 'B' || engajamento() == 'b') {
			if (engajamento() == 'B') {
				System.out.print("Seu engajamento est� bom. ");
			} else {
				System.out.print("Seu engajamento est� bom. Por�m procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("Engenharia         (X)");
			System.out.println("Doc�ncia           (X)");
			System.out.println("Com�rcio Exterior  (X)");
			System.out.println("Gest�o Financeira  (X)");
			System.out.println("Economia           (X)");
		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento est� m�dio. ");
			} else {
				System.out.print("Seu engajamento est� m�dio. Por�m procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("Engenharia         ( )");
			System.out.println("Doc�ncia           (X)");
			System.out.println("Com�rcio Exterior  (X)");
			System.out.println("Gest�o Financeira  (X)");
			System.out.println("Economia           ( )");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas da mat�ria.");
			} else {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas e faltas da mat�ria. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("Engenharia         ( )");
			System.out.println("Doc�ncia           ( )");
			System.out.println("Com�rcio Exterior  ( )");
			System.out.println("Gest�o Financeira  ( )");
			System.out.println("Economia           ( )");
		}
	}

	@Override
	public void opcao() {

		if (op == '1') {
			System.out.println(
					"A Engenharia � a ci�ncia, a arte e a profiss�o de adquirir e de aplicar os conhecimentos matem�ticos, \n"
							+ "t�cnicos e cient�ficos na cria��o, aperfei�oamento e implementa��o de utilidades, tais como materiais, \n"
							+ "estruturas, m�quinas, aparelhos, sistemas ou processos, que realizem uma determinada fun��o ou objetivo.");
		} else if (op == '2') {
			System.out.println("O professor de Matem�tica pode atuar em escolas de ensino fundamental e m�dio. \n"
					+ "Se optar por continuar os estudos fazendo mestrado e doutorado, este professor pode ministrar aulas em "
					+ "universidades.");
		} else if (op == '3') {
			System.out.println(
					"O profissional de com�rcio exterior pode trabalhar com tudo o que est� relacionado aos processos de \n"
							+ "compra e venda de bens e servi�os entres os pa�ses.");
		} else if (op == '4') {
			System.out.println(
					"A maioria dos gestores financeiros trabalha acompanhando os resultados financeiros das empresas: gastos,\n"
							+ " lucro, investimentos, contas a pagar e a receber, folha de pagamentos, etc.\r\n"
							+ "\r\n"
							+ "Outros seguem por um caminho mais anal�tico e buscam dados para elaborar relat�rios que, mais adiante, \n"
							+ "ser�o utilizados para a tomada de decis�o e podem determinar o futuro da empresa.");
		} else {
			System.out.println(
					"O economista lida com quest�es relacionadas ao patrim�nio de pessoas, empresas e institui��es \n"
							+ "governamentais, realizando planejamentos de amplia��o e preserva��o deste patrim�nio.\r\n"
							+ "\r\n"
							+ "Ele realiza estudos e an�lises de mercado e pode lidar tanto com quest�es econ�micas em grande escala, \n"
							+ "nacionais e internacionais, como com projetos de investimentos de pequenas empresas.");
		}
	}
}