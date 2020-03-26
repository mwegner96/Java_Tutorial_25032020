import java.util.*;

class Plaetzchen2 {

	// Instanzvariablen
	String sorte, form, groesse;
	boolean verzierungJaNein;
	// weitere Instanzvariablen hier

	// Instanzmethode
	public void ausgeben() {
		// gibt Informationen über die Plätzchen aus z.B.
		// Sorte Kokos, Groesse mittel, Form rund
		if (verzierungJaNein == true) {
			System.out.println("Sorte: " + sorte + " Form: " + form + " Groesse: " + groesse + " Verzierung: Ja");
			System.out.println(" ");
			System.out.println(" ");
		} else {
			System.out.println("Sorte: " + sorte + " Form: " + form + " Groesse: " + groesse + " Verzierung: Nein");
			System.out.println(" ");
			System.out.println(" ");
		}
	}

	// Test der Klasse Plaetzchen
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String verzierung = new String();
		/*
		 * (1) Erzeugen Sie mit dem new-Operator ein Objekt der Klasse Plaetzchen.
		 * Plaetzchen plaetzchen1 = new Plaetzchen(); // Der Standardkonstruktor wird
		 * von Java zur Verfügung gestellt.
		 */
		Plaetzchen2 plaetzchen1 = new Plaetzchen2();
		Plaetzchen2 plaetzchen2 = new Plaetzchen2();
		Plaetzchen2 plaetzchen3 = new Plaetzchen2();

		// (2) Weisen Sie über die Punktnotation referenzvariable.instanzvariable
		// den Instanzvariablen des Objekts Werte zu.
		System.out.println("-- Plaetzchen 1 --");
		System.out.println(" ");
		System.out.print("Sorte: ");
		plaetzchen1.sorte = scan.nextLine();

		System.out.println(" ");

		System.out.print("Form: ");
		plaetzchen1.form = scan.nextLine();

		System.out.println(" ");

		System.out.print("Groesse: ");
		plaetzchen1.groesse = scan.nextLine();

		do {
			System.out.print("Verzierung? (J/N) ");
			verzierung = scan.nextLine();

			if (!verzierung.equals("J") && !verzierung.equals("N")) {
				System.out.println("Eingabe ungueltig");
				System.out.println(" ");
			}

		} while (!verzierung.equals("J") && !verzierung.equals("N"));

		if (verzierung.equals("J")) {
			plaetzchen1.verzierungJaNein = true;
		} else {
			plaetzchen1.verzierungJaNein = false;
		}

		System.out.println(" ");
		System.out.println(" ");

		// ----------------------------------------
		System.out.println("-- Plaetzchen 2 --");
		System.out.println(" ");

		System.out.print("Sorte: ");
		plaetzchen2.sorte = scan.nextLine();

		System.out.println(" ");

		System.out.print("Form: ");
		plaetzchen2.form = scan.nextLine();

		System.out.println(" ");

		System.out.print("Groesse: ");
		plaetzchen2.groesse = scan.nextLine();

		do {
			System.out.print("Verzierung? (J/N) ");
			verzierung = scan.nextLine();

			if (!verzierung.equals("J") && !verzierung.equals("N")) {
				System.out.println("Eingabe ungueltig");
				System.out.println(" ");
			}

		} while (!verzierung.equals("J") && !verzierung.equals("N"));

		if (verzierung.equals("J")) {
			plaetzchen2.verzierungJaNein = true;
		} else {
			plaetzchen2.verzierungJaNein = false;
		}

		System.out.println(" ");
		System.out.println(" ");

		// ----------------------------------------

		System.out.println("-- Plaetzchen 3 --");
		System.out.println(" ");

		System.out.print("Sorte: ");
		plaetzchen3.sorte = scan.nextLine();

		System.out.println(" ");

		System.out.print("Form: ");
		plaetzchen3.form = scan.nextLine();

		System.out.println(" ");

		System.out.print("Groesse: ");
		plaetzchen3.groesse = scan.nextLine();

		do {
			System.out.print("Verzierung? (J/N) ");
			verzierung = scan.nextLine();

			if (!verzierung.equals("J") && !verzierung.equals("N")) {
				System.out.println("Eingabe ungueltig");
				System.out.println(" ");
			}

		} while (!verzierung.equals("J") && !verzierung.equals("N"));

		if (verzierung.equals("J")) {
			plaetzchen3.verzierungJaNein = true;
		} else {
			plaetzchen3.verzierungJaNein = false;
		}

		System.out.println(" ");
		System.out.println(" ");

		// (3) Lassen Sie dann das Plaetzchen-Objekt seine Methode ausgeben() aufrufen.
		plaetzchen1.ausgeben();
		plaetzchen2.ausgeben();
		plaetzchen3.ausgeben();
		// (4) Testen Sie Ihr Programm.
		// (5) Erzeugen Sie zwei weitere Plaetzchen-Objekte und verfahren Sie wie oben.
	}
}