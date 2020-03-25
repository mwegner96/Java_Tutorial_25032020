import java.util.Scanner;

public class Discounter {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double gesBetr, Discount = 0;

		System.out.print("Geben Sie den Gesamtbetrag ein: ");
		gesBetr = scan.nextDouble();

		System.out.println(" ");

		if (gesBetr > 10.0) {
			Discount = gesBetr / 100 * 90;
			System.out.print("Discountpreis: " + Discount);
		} else {
			System.out.print("kein Discount");
		}
	}
}