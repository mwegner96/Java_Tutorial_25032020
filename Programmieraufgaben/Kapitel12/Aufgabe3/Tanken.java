import java.util.Scanner;

public class Tanken {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int tank = 0, anzeige = 0, verbrauch = 0, reichweite = 0;
		
		System.out.print("Tankkapazitaet: ");
		tank = scan.nextInt();
		
		System.out.print("Benzinanzeige: ");
		anzeige = scan.nextInt();
		
		System.out.print("Meilen pro Gallone: ");
		verbrauch = scan.nextInt();
		
		reichweite = (tank / 100 * 50) * 30;
		
		if (reichweite < 200)
		{
			System.out.println("Tanken!");
		}
		else
		{
			System.out.println("Weiterfahren...");
		}
		
	}
}