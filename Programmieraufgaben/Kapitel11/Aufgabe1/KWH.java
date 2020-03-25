import java.util.Scanner;

public class KWH {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double PreisKwh, Kosten;
		int kwh;
		
		System.out.print("Geben Sie den Preis pro Kilowattstunde in Cent ein: ");
		PreisKwh = scan.nextDouble();
		
		System.out.println(" ");
		
		System.out.print("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein: ");
		kwh = scan.nextInt();
		
		System.out.println(" ");
		
		Kosten = kwh * PreisKwh;
		
		System.out.print("Jahreskosten: " + Kosten/100 + " Euro");
	}
}