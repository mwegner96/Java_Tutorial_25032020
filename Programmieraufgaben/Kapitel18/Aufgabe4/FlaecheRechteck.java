import java.util.Scanner;

public class FlaecheRechteck {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0, b = 1, h = 1, f = 1;

		while (b != 0 || h != 0) {

			b = 1;
			h = 1;

			System.out.println("--- CAD Programm ---");
			System.out.print("Erster Eckpunkt X-Koordinate: ");
			x1 = scan.nextInt();

			System.out.print("Erster Eckpunkt Y-Koordinate: ");
			y1 = scan.nextInt();

			System.out.print("Zweiter  Eckpunkt X-Koordinate: ");
			x2 = scan.nextInt();

			System.out.print("Zweiter  Eckpunkt Y-Koordinate: ");
			y2 = scan.nextInt();
			
			if (x2 >= x1 && y2 >= y1)
			{
			h = y2 - y1;
			b = x2 - x1;
			
			f = b * h;
			
			System.out.println("Breite: " + b + " Hoehe: " + h + " Flaeche " + f);
			}
			else
			{
				System.out.println(" ");
				System.out.println("x2 bzw y2 muessen groeﬂer als x1 bzw y1 sein.");
				System.out.println(" ");
				System.out.println(" ");
			}

		}
		System.out.println(" ");
		System.out.println("Fertig!");
	}
}