import java.util.Scanner;

public class Wechselgeld {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int Dollar, Quater, Dime, Nickel, Cent;

		System.out.print("Geben sie ihren Centbetrag ein:");
		Cent = scan.nextInt();

		Dollar = Cent / 100;
		Cent = Cent % 100;
		Quater = Cent / 50;
		Cent = Cent % 50;
		Dime = Cent / 10;
		Cent = Cent % 10;
		Nickel = Cent / 5;
		Cent = Cent % 5;

		System.out.print("Das Wechselgeld ist: " + Dollar + " Dollar, " + Quater + " Quater, " + Dime + " Dime, "
				+ Nickel + " Nickel und " + Cent + " Cent.");
	}

}