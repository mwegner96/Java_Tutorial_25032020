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

	double berechneOberflaeche() {
		return 2 * berechneOberflaecheVorn() + 2 * berechneOberflaecheOben() + 2 * berechneOberflaecheSeitlich();
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

	public Box groessereBox() {
		return new Box(1.25 * this.breite, 1.25 * this.hoehe, 1.25 * this.laenge);
	}

	public Box kleinereBox() {
		return new Box(0.75 * this.breite, 0.75 * this.hoehe, 0.75 * this.laenge);
	}
	
	public boolean passtIn(Box innereBox, Box aeussereBox )
	{
		if (innereBox.breite < aeussereBox.breite && innereBox.hoehe < aeussereBox.hoehe && innereBox.laenge < aeussereBox.laenge)
		{return true;}
			else
		{return false;}
	}
}

class BoxTester {

	public static void main(String[] args) {
		
		Box box = new Box(2.5, 5.0, 6.0);

		System.out.println("Flaeche: " + box.berechneOberflaeche() + " Volumen: " + box.berechneVolumen());

		System.out.println("Laenge: " + box.getLaenge() + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());

		/* box = box.groessereBox();

		System.out.println("Flaeche: " + box.berechneOberflaeche() + " Volumen: " + box.berechneVolumen());

		System.out.println("Laenge: " + box.getLaenge() + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());

		box = box.kleinereBox();

		System.out.println("Flaeche: " + box.berechneOberflaeche() + " Volumen: " + box.berechneVolumen());

		System.out.println("Laenge: " + box.getLaenge() + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());
		 */
		Box box1 = new Box(1.0, 2.0, 3.0);
		
		if (box.passtIn(box, box1))
		{
			System.out.println("Passt in die aeussere Box!");
		}
		else
		{
			System.out.println("Passt nicht in die aeussere Box!");
		}
		
		
	
	}
}