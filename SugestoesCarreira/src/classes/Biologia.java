package classes;

public class Biologia extends Materia {

	public Biologia(double nota, int faltas, char op) {
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
			System.out.println("1 - Nutri��o               (X)");
			System.out.println("2 - Educa��o Fisica        (X)");
			System.out.println("3 - Medicina               (X)");
			System.out.println("4 - Professor de Biologia  (X)");
			System.out.println("5 - Biologia Marinha       (X)");
		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento est� m�dio. ");
			} else {
				System.out.print("Seu engajamento est� m�dio. Por�m procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea:");
			System.out.println("1 - Nutri��o               ( )");
			System.out.println("2 - Educa��o Fisica        (X)");
			System.out.println("3 - Medicina               ( )");
			System.out.println("4 - Professor de Biologia  (X)");
			System.out.println("5 - Biologia Marinha       (X)");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas da mat�ria.");
			} else {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas e faltas da mat�ria. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea:");
			System.out.println("1 - Nutri��o               ( )");
			System.out.println("2 - Educa��o Fisica        ( )");
			System.out.println("3 - Medicina               ( )");
			System.out.println("4 - Professor de Biologia  ( )");
			System.out.println("5 - Biologia Marinha       ( )");
		}
	}

	@Override
	public void opcao() {

		if (op == '1') {
			System.out.println("Nutri��o: \n" + "- Medicina voltada pra �rea de uma alimenta��o mais saud�vel.");
		} else if (op == '2') {
			System.out.println("Educa��o f�sica: \n"
					+ "- Profissional que trabalha as habiladades com o corpo e exerc�cios f�sicos.");
		} else if (op == '3') {
			System.out.println("Medicina:  \n" + "- Profissionais que diagosticam e cuidam da sa�de da popula��o.");
		} else if (op == '4') {
			System.out.println("Professor de biologia\r\n" + "- Professional que leciona em escolas ou universidades.");
		} else {
			System.out.println("Biologia marinha: \n"
					+ "- Profissionais que estudam os organismos que vivem no ecossistema salgado.");
		}
	}
}