import java.util.Scanner;

public class harmonischeMittel {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, y;
		double arithMittel, harmonMittel;
		
		System.out.print("Geben Sie x ein: ");
		x = scan.nextInt();
		
		System.out.println(" ");
		
		System.out.print("Geben Sie y ein: ");
		y = scan.nextInt();
		
		arithMittel = (x + y) / 2;
		harmonMittel = 2 / (1.0/x + 1.0/y);
		
		System.out.println("Arithmetisches Mittel: " + arithMittel);
		System.out.println("Harmonisches Mittel  : " + harmonMittel);
	}
}