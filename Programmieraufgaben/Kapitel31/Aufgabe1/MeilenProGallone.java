import java.util.Scanner;

class Auto {
	// Instanzvariablen
	double startMeilen; // Anfangsstand Tachometer
	double endMeilen; // Endstand Tachometer
	double gallonen; // verbrauchte Gallonen Benzin

	// Konstruktor
	Auto(double startTacho, double endTacho, double galls) {
		startMeilen = startTacho;
		endMeilen = endTacho;
		gallonen = galls;
	}

	boolean benzinschwein() {
		if (berechneMPG() < 15.0) {
			return true;
		}
		else
		{return false;}
	}

	boolean sparauto() {
		if (berechneMPG() > 30.0) {
			return true;
		}
		else
		{return false;}
	}

	// Methoden
	double berechneMPG() {
		return (endMeilen - startMeilen) / gallonen;
	}

}

class MeilenProGallone {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int Anfang, ende, gallonen;

		System.out.print("Geben Sie den Anfangsmeilenstand ein: ");
		Anfang = scan.nextInt();

		System.out.print("Geben Sie den Endmeilenstand ein: ");
		ende = scan.nextInt();

		System.out.print("Geben Sie die Gallonen ein: ");
		gallonen = scan.nextInt();

		Auto auto = new Auto(Anfang, ende, gallonen);
		System.out.println("Meilen pro Gallonen: " + auto.berechneMPG());
		
		if (auto.sparauto())
		{
			System.out.println("Sparauto!");
		}
		
		if (auto.benzinschwein())
		{
			System.out.println("Senzinschwein!");
		}
	}
}