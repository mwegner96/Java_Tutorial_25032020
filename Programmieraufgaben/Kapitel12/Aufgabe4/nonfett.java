import java.util.Scanner;

public class nonfett {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a, b, ergA, ergB;
		int pa, pb;

		System.out.print("Preis pro Pfund Packung A: ");
		a = scan.nextDouble();

		System.out.print("Prozent mageres Fleisch Packung A: ");
		pa = scan.nextInt();

		System.out.print("Preis pro Pfund Packung B: ");
		b = scan.nextDouble();

		System.out.print("Prozent mageres Fleisch Packung B: ");
		pb = scan.nextInt();

		ergA = a / pa * 100;
		ergB = b / pb * 100;

		System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + ergA);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + ergB);

		if (ergA == ergB) {
			System.out.print("Packungen sind gleich preiswert.");
		} else {
			if (ergA < ergB) {
				System.out.print("Packung A ist preiswerter.");
			} else {
				System.out.print("Packung B ist preiswerter.");
			}
		}

	}
}