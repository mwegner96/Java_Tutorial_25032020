import java.util.*;

class Plaetzchen {

	// Instanzvariablen
	String sorte, form, groesse;
	// weitere Instanzvariablen hier

	// Instanzmethode
	public void ausgeben() {
		// gibt Informationen über die Plätzchen aus z.B.
		// Sorte Kokos, Groesse mittel, Form rund
		System.out.println("Sorte: " + sorte + " Form: " + form + " Groesse: " + groesse);
		System.out.println(" ");
		System.out.println(" ");
	}

	// Test der Klasse Plaetzchen
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		 * (1) Erzeugen Sie mit dem new-Operator ein Objekt der Klasse Plaetzchen.
		 * Plaetzchen plaetzchen1 = new Plaetzchen(); // Der Standardkonstruktor wird
		 * von Java zur Verfügung gestellt.
		 */
		Plaetzchen plaetzchen1 = new Plaetzchen();
		Plaetzchen plaetzchen2 = new Plaetzchen();
		Plaetzchen plaetzchen3 = new Plaetzchen();

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