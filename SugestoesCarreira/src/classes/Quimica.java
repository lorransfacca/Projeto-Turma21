package classes;

public class Quimica extends Materia {
	public Quimica(double nota, int faltas, char op) {
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
			// System.out.println("Tratamento de �gua e res�duos industriais (x)");
			// System.out.println("Preven��o de riscos no trabalho (x)");
			System.out.println("1 - Usinas de reciclagem   (X)");
			// System.out.println("Vin�colas e cacha�arias (x)");
			System.out.println("2 - Qu�mica forense        (X)");
			System.out.println("3 - Energias alternativas  (X)");
			System.out.println("4 - An�lise toxicol�gica   (X)");
			System.out.println("5 - Controle de qualidade  (X)");
			// System.out.println("Farmac�utico (x)");
			// System.out.println("An�lise de narc�ticos (x)");
		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento est� m�dio. ");
			} else {
				System.out.print("Seu engajamento est� m�dio. Por�m procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea: ");
			// System.out.println("Tratamento de �gua e res�duos industriais (x)");
			// System.out.println("Preven��o de riscos no trabalho (x)");
			System.out.println("1 - Usinas de reciclagem   ( )");
			// System.out.println("Vin�colas e cacha�arias (x)");
			System.out.println("2 - Qu�mica forense        ( )");
			System.out.println("3 - Energias alternativas  (X)");
			System.out.println("4 - An�lise toxicol�gica   (X)");
			System.out.println("5 -Controle de qualidade   (X)");
			// System.out.println("Farmac�utico ( )");
			// System.out.println("An�lise de narc�ticos ( )");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas da mat�ria.");
			} else {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas e faltas da mat�ria. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea: ");
			// System.out.println("Tratamento de �gua e res�duos industriais ( )");
			// System.out.println("Preven��o de riscos no trabalho ( )");
			System.out.println("1 - Usinas de reciclagem   ( )");
			// System.out.println("Vin�colas e cacha�arias ( )");
			System.out.println("2 - Qu�mica forense        ( )");
			System.out.println("3 - Energias alternativas  ( )");
			System.out.println("4 - An�lise toxicol�gica   ( )");
			System.out.println("5 - Controle de qualidade  ( )");
			// System.out.println("Farmac�utico ( )");
			// System.out.println("An�lise de narc�ticos ( )");
		}

	}

	@Override
	public void opcao() {
		if (op == '1') {
			System.out.println("Usinas de reciclagem:\n" + "	//De acordo com o especialista, a reciclagem qu�mica \n"
					+ "	//consiste na transforma��o dos res�duos pl�sticos em insumos qu�micos, \n"
					+ "	//combust�veis ou mat�ria-prima para a fabrica��o de novos produtos pl�sticos." + 1);
		} else if (op == '3') {
			System.out.println("Energias alternativas:\n" + "	 * \r\n"
					+ "	 * O que faz e onde trabalha o profissional de energia renov�vel\n"
					+ "Quem segue carreira nesse ramo realiza as seguintes atividades: \n" + "\n"
					+ "Projeto, instala��o, opera��o e manuten��o de sistemas de energia industriais, comerciais e residenciais baseados em energias renov�veis (solar, e�lica, biomassa, geot�rmica, entre outras). \r\n"
					+ "Pesquisa e desenvolvimento de novas formas, equipamentos e t�cnicas de produzir energia renov�vel.\r\n"
					+ "Otimiza��o de sistemas de energias renov�veis para diminuir os impactos ambientais e garantir sustentabilidade.\r\n"
					+ "Elabora��o de projetos de viabilidade t�cnica e econ�mica para aplica��o de sistemas de energias renov�veis. \r\n"
					+ "Vistoria, per�cia, avalia��o, emiss�o de laudo e parecer t�cnico em sua �rea de forma��o." + 2);
		} else if (op == '2') {
			System.out.println("Qu�mica forense:\n"
					+ "	 * no intuito de auxiliar a investigar e compreender como determinados crimes ocorreram" + 3);
		} else if (op == '4') {
			System.out.println("An�lise toxicol�gica:\n"
					+ "	 * S�o realizadas an�lises em sangue, plasma, urina e cabelo para monitoramento de exposi��o a metais e compostos org�nicos"
					+ 4);
		} else {
			System.out.println("Controle de qualidade :\n"
					+ "		 * O controle de qualidade � o termo que se refere ao sistema utilizado para medir o a qualidade de produtos e servi�os de acordo com an�lises e par�metros t�cnicos."
					+ 5);
		}

	}
}