import java.util.Scanner;

class Box {
	private double hoehe, breite, laenge;

	Box(double breite, double hoehe, double laenge) {
		this.breite = breite;
		this.hoehe = hoehe;
		this.laenge = laenge;
	}

	Box(double seite) {
		this.breite = seite;
		this.hoehe = seite;
		this.laenge = seite;
	}
	
	Box(Box alteBox) {
		
	}

	double berechneVolumen() {
		return this.breite * this.hoehe * this.laenge;
	}

	private double berechneOberflaecheVorn() {
		return this.breite * this.hoehe;
	}

	private double berechneOberflaecheOben() {
		return this.breite * this.laenge;
	}

	private double berechneOberflaecheSeitlich() {
		return this.hoehe * this.laenge;
	}

	double berechneOberflaeche( ) 
	{
		return 2 * berechneOberflaecheVorn() +
		           2 * berechneOberflaecheOben() +
		           2 * berechneOberflaecheSeitlich();
	}

	public double getLaenge() {
		return laenge;
	}

	public double getBreite() {
		return breite;
	}

	public double getHoehe() {
		return hoehe;
	}
}

class BoxTester {

	public static void main(String[] args) {
		Box box = new Box(2.5, 5.0, 6.0);

		System.out.println("Flaeche: " + box.berechneOberflaeche() + " Volumen: " + box.berechneVolumen());

		System.out.println("Laenge: " + box.getLaenge() + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());
	}
}