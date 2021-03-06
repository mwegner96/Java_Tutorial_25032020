import java.util.*;

class Marmelade {
	// Instanzvariablen
	private String inhalt; // Art der Frucht im Glas
	private String datum; // Datum des Abf�llens
	private int menge; // Menge der Marmelade im Glas

	// Konstruktor
	public Marmelade(String inhalt, String datum, int menge) {
		this.inhalt = inhalt;
		this.datum = datum;
		this.menge = menge;
	}

	// Methoden
	public boolean istLeer() {
		return (menge == 0);
	}

	public void ausgeben() {
		System.out.println(inhalt + "   " + datum + "   " + menge + " Unzen.");
	}

	public void auftragen(int unzen) {
		if (!istLeer()) {
			if (unzen <= menge) {
				System.out.println("Auftragen von " + unzen + " Unzen " + inhalt);
				System.out.println();
				menge = menge - unzen;
			} else {
				System.out.println("Auftragen von  " + menge + " Unzen " + inhalt);
				System.out.println();
				menge = 0;
			}
		} else {
			System.out.println("Keine Marmelade im Glas!");
			System.out.println();
		}
	}

}

class Vorratskammer {
	// Instanzvariablen
	private Marmelade glas1;
	private Marmelade glas2;
	private Marmelade glas3;
	private Marmelade glasAusgewaehlt;

	// Konstruktor
	public Vorratskammer(Marmelade glas1, Marmelade glas2, Marmelade glas3) {
		this.glas1 = glas1;
		this.glas2 = glas2;
		this.glas3 = glas3;
		glasAusgewaehlt = null;
	}

	// Methoden
	public void ausgeben() {
		System.out.println("Die Vorratskammer enthaelt:");
		System.out.print("1: ");
		glas1.ausgeben();
		System.out.print("2: ");
		glas2.ausgeben();
		System.out.print("3: ");
		glas3.ausgeben();
	}

	// wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2, oder
	// 3
	public void auswaehlen(int glasNummer) {
		if (glasNummer == 1)
			glasAusgewaehlt = glas1;

		else if (glasNummer == 2)
			glasAusgewaehlt = glas2;

		else
			glasAusgewaehlt = glas3;
	}

	// Auftragen der ausgew�hlten Marmelade
	public void auftragen(int unzen) {
		glasAusgewaehlt.auftragen(unzen);
	}
}

class VorratskammerTester {
	public static void main(String[] args) {
		Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
		Marmelade erdbeer = new Marmelade("Erdbeer", "30.09.10", 8);
		Marmelade aprikosen = new Marmelade("Aprikosen", "31.10.10", 3);
		Scanner scan = new Scanner(System.in);
		int auswahl, menge = 0;

		Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer, aprikosen);

		do {
			vorrat.ausgeben();

			do {
				System.out.print("Treffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1: ");
				auswahl = scan.nextInt();

				if (auswahl == 1 || auswahl == 2 || auswahl == 3) {
					vorrat.auswaehlen(auswahl);
				} else {
					if (auswahl == -1) {
						System.out.println("Good-bye");
					} else {
						System.out.println("Falsche Eingabe!");
						System.out.println();
					}
				}

			} while (auswahl != 1 && auswahl != 2 && auswahl != 3 && auswahl != -1);

			if (auswahl != -1) {
				do {

					System.out.print("Geben Sie die Menge ein, die aufgetragen werden soll: ");
					menge = scan.nextInt();

					if (menge >= 0) {
						vorrat.auftragen(menge);
					} else {
						System.out.println("Menge darf nicht < 0 sein!");
						System.out.println();
					}

				} while (menge < 0);
			}

		} while (auswahl != -1);
	}
}