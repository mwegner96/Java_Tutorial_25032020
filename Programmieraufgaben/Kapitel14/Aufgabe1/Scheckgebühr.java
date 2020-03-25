import java.util.Scanner;

public class Scheckgebühr {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int giro, spar;

		System.out.print("Geben Sie Ihren Girokontostand ein: ");
		giro = scan.nextInt();

		System.out.print("Geben Sie Ihren Sparkontostand ein: ");
		spar = scan.nextInt();

		if (giro > 1000 && spar > 1500) {
			System.out.println("Es wird keine Gebuehr erhoben.");
		} else {
			System.out.println("Es wird eine Gebuehr von 0,15$ erhoben.");
		}
	}
}