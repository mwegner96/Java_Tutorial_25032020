import java.lang.*;
import java.util.*;

class Artikel {

	private int artikelNr, lagerzeit;
	private String bezeichnung = new String();
	private double einkaufspreis;
	final double HANDELSSPANNE = 0.6; // 60 Prozent des Einkaufspreises
	final double MWST = 0.19; // 19 Prozent

	Artikel(int artikelNum, String bez, double preis, int lager) {
		this.artikelNr = artikelNum;
		this.lagerzeit = lager;
		this.bezeichnung = bez;
		this.einkaufspreis = preis;
	}

	public void anzeigen() {
		
		System.out.println("Artikelnr.: " + artikelNr + " | Bezeichnung: " + bezeichnung + " | Einkaufspreis: "
				+ einkaufspreis + " Euro | Verkaufspreis: " + berechneVerkaufspreis() + " Euro | Lagerzeit: " + lagerzeit);
		System.out.println();
	}

	public double berechneVerkaufspreis() {
		double verkaufspreis = (einkaufspreis * (1 + HANDELSSPANNE)) * (1 + MWST);

		return verkaufspreis;
	}
	
	public double getEinkauf()
	{
		return einkaufspreis;
	}

}

class Sonderposten extends Artikel {
	private double rabatt;

	Sonderposten(int artikelNum, String bez, double preis, int lager) {
		super(artikelNum, bez, preis, lager);

		if (lager > 12) {
			this.rabatt = 0.30;
		} else {
			this.rabatt = 0.10;
		}
	}

	public void anzeigen() {
		System.out.println("Sonderposten: ");
		super.anzeigen();
		System.out.println(
				"(VK <alt>: " + berechneVerkaufspreis() / (100 - (rabatt*100)) * 100 + " Euro | Rabatt" + rabatt * 100 + "%)");
	}

	public double berechneVerkaufspreis() {
		double verkaufspreis = (super.getEinkauf() * (1 + HANDELSSPANNE)) * (1 + MWST) * (1-rabatt);

		return verkaufspreis;
	}
}

class OldScotch {
	static int artikelnr, lagerzeit, i = 0;
	static String str;
	static double ekpreis;

	public static void eingabe() {
		Scanner scan = new Scanner(System.in);
		artikelnr = 0;
		str = null;
		ekpreis = 0;
		lagerzeit = 0;

		i++;

		System.out.println("---" + i + ". Artikel---");
		System.out.println();
		System.out.print("Geben Sie die Artikelnr. ein: ");
		artikelnr = scan.nextInt();

		scan.nextLine();

		System.out.print("Geben Sie die Bezeichnung ein: ");
		str = scan.nextLine();

		System.out.print("Geben Sie den Einkaufspreis ein: ");
		ekpreis = scan.nextDouble();

		System.out.print("Geben Sie die Lagerzeit ein: ");
		lagerzeit = scan.nextInt();
		
		System.out.println();
	}

	public static void main(String[] args) {

		eingabe();
		Artikel art1 = new Artikel(artikelnr, str, ekpreis, lagerzeit);

		eingabe();
		Sonderposten sonder1 = new Sonderposten(artikelnr, str, ekpreis, lagerzeit);

		art1.anzeigen();
		sonder1.anzeigen();

	}
}