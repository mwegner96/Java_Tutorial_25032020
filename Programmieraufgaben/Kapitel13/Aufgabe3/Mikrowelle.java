import java.util.Scanner;

public class Mikrowelle {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int posten; double zeit;

		System.out.print("Geben Sie die Anazahl der Posten ein: ");
		posten = scan.nextInt();

		System.out.print("Geben Sie die Erhitzungszeit ein: ");
		zeit = scan.nextInt();

		if (posten <= 3) {
			if (posten == 1) {
				zeit = zeit;
			}

			if (posten == 2) {
				zeit = zeit * 1.5;
			}

			if (posten == 3) {
				zeit = zeit * 2;
			}
			
			System.out.print("Erhitzungszeit: " + zeit);
			
		} else {
			System.out.print("Mehr als 3 Posten werden nicht empfohlen");
		}

	}
}