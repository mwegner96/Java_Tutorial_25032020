import java.util.Scanner;

public class fantasy {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int st, ges, gl, gesamt;
		String name = new String();

		System.out.println("Willkommen zu Yertle's Schatzsuche");
		System.out.print("Geben Sie den Namen der Spielfigur ein: ");
		name = scan.nextLine();

		System.out.print("Staerke eingeben (1-10): ");
		st = scan.nextInt();

		System.out.print("Gesundheit eingeben (1-10): ");
		ges = scan.nextInt();

		System.out.print("Glueck eingeben (1-10): ");
		gl = scan.nextInt();

		gesamt = st + ges + gl;

		if (gesamt > 15) {
			st = 5;
			ges = 5;
			gl = 5;
			System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben!");
		}

		System.out.println(name + ", Staerke: " + st + ", Gesundheit: " + ges + ", Glueck: " + gl);
	}
}