package classes;

public class Portugues extends Materia {

	public Portugues(double nota, int faltas, char op) {
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
			System.out.println("1 - Jornalismo               (X)");
			System.out.println("2 - Letras                   (X)");
			System.out.println("3 - Direito                  (X)");
			System.out.println("4 - Publicidade e Propaganda (X)");
			System.out.println("5 - Ci�ncias Sociais         (X)");

		} else if (engajamento() == 'M' || engajamento() == 'm') {
			if (engajamento() == 'M') {
				System.out.print("Seu engajamento est� m�dio. ");
			} else {
				System.out.print("Seu engajamento est� m�dio. Por�m procure melhorar suas faltas. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea:");
			System.out.println("1 - Jornalismo               ( )");
			System.out.println("2 - Letras                   (X)");
			System.out.println("3 - Direito                  ( )");
			System.out.println("4 - Publicidade e Propaganda (X)");
			System.out.println("5 - Ci�ncias Sociais         (X)");
		} else {
			if (engajamento() == 'R') {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas da mat�ria.");
			} else {
				System.out.print("Seu engajamento est� ruim. Procure melhorar nas notas e faltas da mat�ria. ");
			}
			System.out.println("Lista de sugest�es a seguir nesta �rea:");
			System.out.println("1 - Jornalismo               ( )");
			System.out.println("2 - Letras                   ( )");
			System.out.println("3 - Direito                  ( )");
			System.out.println("4 - Publicidade e Propaganda ( )");
			System.out.println("5 - Ci�ncias Sociais         ( )");
		}
	}

	@Override
	public void opcao() {

		if (op == '1') {
			System.out.println("Imprime opcao..." + 1);
		} else if (op == '2') {
			System.out.println("Imprime opcao..." + 2);
		} else if (op == '3') {
			System.out.println("Imprime opcao..." + 3);
		} else if (op == '4') {
			System.out.println("Imprime opcao..." + 4);
		} else {
			System.out.println("Imprime opcao..." + 5);
		}
	}
}
