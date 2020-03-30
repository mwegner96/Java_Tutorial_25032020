import java.util.Scanner;

class Auto {
	// Instanzvariablen
	double startMeilen = 0; // Anfangsstand Tachometer
	double endMeilen; // Endstand Tachometer
	double gallonen; // verbrauchte Gallonen Benzin

	// Konstruktor
	Auto(double endTacho, double galls) {
		endMeilen = endTacho;
		gallonen = galls;
	}

	boolean benzinschwein() {
		if (berechneMPG() < 15.0) {
			return true;
		} else {
			return false;
		}
	}

	boolean sparauto() {
		if (berechneMPG() > 30.0) {
			return true;
		} else {
			return false;
		}
	}

	// Methoden
	double berechneMPG() {
		return (endMeilen - startMeilen) / gallonen;
	}

	void auftanken() {
		this.startMeilen = this.endMeilen;
	}

}

class MeilenProGallone {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int Anfang, ende, gallonen;
		String neu;
		Auto auto = new Auto(0, 0);

		do {
			auto.auftanken();
			System.out.println();
			System.out.println();
			System.out.println("+++ Besuch der Tankstelle +++");

			System.out.println("alter Tachometerstand: " + auto.startMeilen);

			System.out.print("Aktuellen Tachometerstand eingeben:");
			ende = scan.nextInt();

			System.out.print("Anzahl der Gallonen fuer die Tankfuellung: ");
			gallonen = scan.nextInt();

			auto.endMeilen = ende;
			auto.gallonen = gallonen;
			
			System.out.print("Meilen pro Gallonen: " + auto.berechneMPG());

			if (auto.sparauto()) {
				System.out.println("  Autotyp: Sparauto!");
			}

			if (auto.benzinschwein()) {
				System.out.println("  Autotyp: Benzinschwein!");
			}

			do {
				System.out.print("Programm beenden <j>a <n>ein?");
				neu = scan.next();
			
				if(neu.equals("n"))
				{
					auto.auftanken();
				}
				else
				{
					if (!neu.equals("j"))
					{
						System.out.println();
						System.out.println("Falsche Eingabe!");
						System.out.println();
					}
				}
			
			}while (!neu.equals("n") && !neu.equals("j"));
			
		} while (neu.equals("n"));
	}
}