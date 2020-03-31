import java.lang.*;
import java.util.*;

class Artikel{
	
	private int artikelNr, lagerzeit;
	private String bezeichnung = new String();
	private double einkaufspreis, verkaufspreis;;
	final double  HANDELSSPANNE = 0.6  ; // 60 Prozent des Einkaufspreises
	final double  MWST          = 0.19 ; // 19 Prozent
	
	Artikel(int artikelNum, String bez, double preis, int lager)
	{
		this.artikelNr = artikelNum;
		this.lagerzeit = lager;
		this.bezeichnung = bez;
		this.einkaufspreis = preis;		
	}
	
	public void anzeigen()
	{
		System.out.println("Artikelnr.: " + artikelNr + " | Bezeichnung: " + bezeichnung + 
				" | Einkaufspreis: " + einkaufspreis + " | Verkaufspreis: " 
				+ berechneVerkaufspreis() + " | Lagerzeit: " + lagerzeit);
	}
	
	
	public double berechneVerkaufspreis()
	{
		verkaufspreis = (einkaufspreis * (1 + HANDELSSPANNE)) * (1 + MWST);
		
		return verkaufspreis;
	}
	
}

class OldScotch
{
	static int artikelnr, lagerzeit, i = 0;
	static String str;
	static double ekpreis;
	
	public static void eingabe ()
	{
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
		
		System.out.print("Geben Sie die Bezeichnung ein: ");
		str = scan.toString();

		
		System.out.print("Geben Sie den Einkaufspreis ein: ");
		ekpreis = scan.nextDouble();
		
		System.out.print("Geben Sie den Lagerzeit ein: ");
		lagerzeit = scan.nextInt();
	}
	

	public static void main(String[] args) {
		
		
		eingabe();
		Artikel art1 = new Artikel(artikelnr, str, ekpreis, lagerzeit);
		
		eingabe();
		Artikel art2 = new Artikel(artikelnr, str, ekpreis, lagerzeit);
		
		art1.anzeigen();
		art2.anzeigen();
		
}
	}