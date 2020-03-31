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

	public void anzeigen() {
		// zeigt den Namen des Haustiers an und wie viele Tage der Futtervorrat reicht
		System.out.println(this.name);
		System.out.println();
		fuettern();
		System.out.println("Der Vorrat fuer " + this.name + " reicht " + this.anzahlTage + " Tage");
		System.out.println();
	}

	public abstract void friss();

	public abstract void sprich();
}

class Hund extends Haustiere {
	Hund(String name, double futtervorrat) {
		super(name, futtervorrat);
	}

	public void sprich() {
		System.out.println("Wuff!");
	}

	public void friss() {
		System.out.println(this.name + ": " + this.futtervorrat);
		this.futtervorrat -= 1.0;

	}

}

class Katze extends Haustiere {
	Katze(String name, double futtervorrat) {
		super(name, futtervorrat);
	}

	public void sprich() {
		System.out.println("Miau!");
	}

	public void friss() {
		System.out.println(this.name + ": " + this.futtervorrat);
		this.futtervorrat -= 0.5;
	}
}

public class HaustierTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		double futtervorrat;

		System.out.print("Geben Sie den Namen ihrer Katze ein: ");
		name = scan.nextLine();

		System.out.print("Geben Sie den Futtervorrat ein: ");
		futtervorrat = scan.nextDouble();

		Haustiere cat = new Katze(name, futtervorrat);

		scan.nextLine();

		System.out.print("Geben Sie den Namen ihres Hundes ein: ");
		name = scan.nextLine();

		System.out.print("Geben Sie den Futtervorrat ein: ");
		futtervorrat = scan.nextDouble();

		Haustiere dog = new Hund(name, futtervorrat);

		cat.anzeigen();
		dog.anzeigen();

	}
}