package classes;

public class Historia extends Materia {

	public Historia(double nota, int faltas, char op) {
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
			System.out.println("Lista de sugest�es a seguir nesta �rea:");
			System.out.println("1 - Jornalismo       (X)");
			System.out.println("2 - Paleontologia    (X)");
			System.out.println("3 - Arqueologia      (X)");
			System.out.println("4 - Turismo          (X)");
			System.out.println("5 - Ci�ncia Sociais  (X)");
		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento est� m�dio. ");
			} else {
				System.out.print("Seu engajamento est� m�dio. Por�m procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea:");
			System.out.println("1 - Jornalismo       ( )");
			System.out.println("2 - Paleontologia    (X)");
			System.out.println("3 - Arqueologia      (X)");
			System.out.println("4 - Turismo          ( )");
			System.out.println("5 - Ci�ncia Sociais  (X)");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas da mat�ria.");
			} else {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas e faltas da mat�ria. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("1 - Jornalismo       ( )");
			System.out.println("2 - Turismo          ( )");
			System.out.println("3 - Arqueologia      ( )");
			System.out.println("4 - Paleontologia    ( )");
			System.out.println("5 - Ci�ncia Sociais  ( )");
		}
	}

	@Override
	public void opcao() {

		if (op == '1') {
			System.out.println(" ARQUEOLOGIA:\n"
					+ " A arqueologia � a ci�ncia social que estuda o passado das civiliza��es humanas por meio dos vest�gios materiais deixados por elas, \r\n"
					+ " sendo muito importante para a sociedade, pois resgata a hist�ria e a cultura dos antepassados. Ela come�ou ainda no s�culo XV com o h�bito \r\n"
					+ " de colecionar rel�quias e antiguidades e, com o tempo, foi se tornando mais profissional e indispens�vel."
					+ 1);
		} else if (op == '2') {
			System.out.println("  PALEONTOLOGIA:\n"
					+ "O instrumento principal de estudos de um paleont�logo s�o os f�sseis, que s�o restos e vest�gios de animais, plantas e outros seres vivos, \r\n"
					+ "preservados em rochas, assim como ossos, rastros e pegadas que podem ser identificados em campos de escava��o e locais a c�u aberto. \r\n"
					+ "H� demanda para aqueles que querem reconstituir o passado e passar os seus conhecimentos adiante para as novas gera��es."
					+ 2);
		} else if (op == '3') {
			System.out.println("  JORNALISMO:\n"
					+ "O jornalista � o profissional respons�vel pela apura��o, investiga��o e apresenta��o de informa��es de interesse p�blico em forma de \r\n"
					+ "not�cias, reportagens, artigos ou entrevistas." + 3);
		} else if (op == '4') {
			System.out.println("  CI�NCIAS SOCIAIS: \n"
					+ "Seu foco � na an�lise de movimentos e de conflitos sociais e na forma��o de opini�es e constru��o de identidades por meio da pesquisa \r\n"
					+ "sobre h�bitos, costumes e as rela��es entre as pessoas tanto em grupos de interesses quanto na sociedade como um todo. Para isso, o  \r\n"
					+ "profissional elabora um conjunto de metodologias para analisar a coletividade e interpretar seus problemas culturais e pol�ticos."
					+ 4);

		} else {
			System.out.println("  TURISMO: \n"
					+ "// O turism�logo � respons�vel por analisar e estudar o turismo em sua regi�o para planejar, organizar e gerenciar produtos e atividades \r\n"
					+ "// tur�sticas de todos os tipos. �reas em que se pode atuar, �Ag�ncia de Viagens, Ecoturismo, Hotelaria, Turismo de Neg�cios e etc�."
					+ 5);
		}

	}

}
