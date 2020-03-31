import java.util.*;
import java.lang.*;

abstract class Haustiere {
	String name;
	double futtervorrat;
	int anzahlTage; // gibt die Anzahl Tage aus, die der Futtervorrat reicht

	Haustiere(String name, double futtervorrat) {
		this.name = name;
		this.futtervorrat = futtervorrat;
	}

	public void fuettern() {
		// Hier erfolgt zuerst der Aufruf der Methode sprich().
		sprich();
		// Solange der Futtervorrat reicht, wird dann die Methode friss() aufgerufen
		while (this.futtervorrat > 0) {
			this.anzahlTage++;
			friss();
		}

		// und die Anzahl der Tage hochgezählt, die der Vorrat reicht.
		// Implementiert werden die abstrakten Methoden sprich() und friss() erst in den
		// Subklassen.
	}

	public abstract void anzeigen();

	public abstract void friss();

	public abstract void sprich();
}

class Hund extends Haustiere {

	private String kategorie;

	Hund(String name, double futtervorrat, int kategorie) {
		super(name, futtervorrat);
		if (kategorie == 1) {
			this.kategorie = "Kleinhunde";
		} else {
			if (kategorie == 2) {
				this.kategorie = "Mittelgrosse Hunde";
			} else {
				this.kategorie = "Grosse Hunde";
			}
		}
	}

	public void sprich() {
		System.out.println("Wuff!");
	}

	public void friss() {
		System.out.println(this.name + ": " + this.futtervorrat);
		this.futtervorrat -= 1.0;
	}

	public void anzeigen() {
		// zeigt den Namen des Haustiers an und wie viele Tage der Futtervorrat reicht
		System.out.println(this.name);
		System.out.println();
		fuettern();
		System.out.println("(Kategorie: " + this.kategorie + ") " + "Der Vorrat fuer " + this.name + " reicht "
				+ this.anzahlTage + " Tage");
		System.out.println("--------------------------------------------------");
		System.out.println();
	}

}

class Katze extends Haustiere {

	private String haltung;

	Katze(String name, double futtervorrat, int haltung) {
		super(name, futtervorrat);
		if (haltung == 1) {
			this.haltung = "Wohnung";
		} else {
			this.haltung = "Artgerecht";
		}
	}

	public void sprich() {
		System.out.println("Miau!");
	}

	public void friss() {
		System.out.println(this.name + ": " + this.futtervorrat);
		this.futtervorrat -= 0.5;
	}

	public void anzeigen() {
		// zeigt den Namen des Haustiers an und wie viele Tage der Futtervorrat reicht
		System.out.println(this.name);
		System.out.println();
		fuettern();
		System.out.println("(Haltung: " + this.haltung + ") " + "Der Vorrat fuer " + this.name + " reicht "
				+ this.anzahlTage + " Tage");
		System.out.println("--------------------------------------------------");
		System.out.println();
	}

}

public class HaustierTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		double futtervorrat;
		int art;

		System.out.print("Geben Sie den Namen ihrer Katze ein: ");
		name = scan.nextLine();

		System.out.print("Geben Sie den Futtervorrat ein: ");
		futtervorrat = scan.nextDouble();
		
		System.out.println("Haltung der Katze: \n <1>: Wohnung \n <2>: Artgerecht");
		do {
			System.out.print("Auswahl: ");
			art = scan.nextInt();
		
			if (art != 1 && art != 2)
				{
					System.out.println();
					System.out.println("Falsche Eingabe :(");
					System.out.println();
				}
		
		}while (art != 1 && art != 2);
		System.out.println();
		
		Haustiere cat = new Katze(name, futtervorrat, art);

		scan.nextLine();

		System.out.print("Geben Sie den Namen ihres Hundes ein: ");
		name = scan.nextLine();

		System.out.print("Geben Sie den Futtervorrat ein: ");
		futtervorrat = scan.nextDouble();
		
		System.out.println("Kategorie des Hundes: \n <1>: Kleinhunde \n <2>: Mittelgrosse Hunde \n <3>: Grosse Hunde");
		do {
			System.out.print("Auswahl: ");
			art = scan.nextInt();
		
			if (art != 1 && art != 2 && art != 3)
				{
					System.out.println();
					System.out.println("Falsche Eingabe :(");
					System.out.println();
				}
		
		}while (art != 1 && art != 2 && art != 3);
		System.out.println();
		
		Haustiere dog = new Hund(name, futtervorrat, art);

		cat.anzeigen();
		dog.anzeigen();

	}
}