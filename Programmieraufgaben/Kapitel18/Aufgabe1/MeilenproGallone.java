import java.util.Scanner;

public class MeilenproGallone {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int anfang = 0, ende = 0, gallonen = 0;
		double meilen = 0;

		while (anfang != -1) {
			System.out.println("--- Programm Meilen pro Gallone ---");
			System.out.println(" ");
			System.out.print("Anfangsstand Meilen: ");
			anfang = scan.nextInt();

			if (anfang != -1) {
				System.out.print("Endstand Meilen: ");
				ende = scan.nextInt();
				System.out.print("Gallonen: ");
				gallonen = scan.nextInt();

				meilen = ((ende + 0.0) - (anfang + 0.0)) / (gallonen + 0.0);

				System.out.println("Meilen pro Gallone: " + meilen);

				System.out.println(" ");
				System.out.println("----------------------------------");
				System.out.println(" ");
			}
		}

		System.out.println("Bye");

	}
}