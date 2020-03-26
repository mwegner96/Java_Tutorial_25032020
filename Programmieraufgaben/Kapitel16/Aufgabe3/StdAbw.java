import java.util.Scanner;
import java.lang.*;

public class StdAbw {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int anzahl = 0, zaehler = 0;
		double zahlen = 0, sd = 0, durchschnittq = 0, durchschnitt2 = 0, xi = 0, xi2 = 0;

		System.out.print("Geben Sie die Anzahl ein: ");
		anzahl = scan.nextInt();

		while (zaehler < anzahl) {
			zaehler++;

			System.out.print("Geben Sie eine Zahl ein: ");
			zahlen = scan.nextDouble();

			xi = xi + zahlen;
			xi2 = xi2 + (zahlen * zahlen);
		}

		durchschnittq = xi2 / anzahl;
		durchschnitt2 = Math.pow(xi / anzahl, 2);

		sd = Math.sqrt(durchschnittq - durchschnitt2);

		System.out.println(" ");
		System.out.println("Standardabweichung: " + sd);
	}
}