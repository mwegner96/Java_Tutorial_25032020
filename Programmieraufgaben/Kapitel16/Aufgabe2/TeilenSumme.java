import java.util.Scanner;

public class TeilenSumme {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double summe = 0;
		int anz = 0, zaehler = 0;
		
		System.out.print("Geben Sie n ein: ");
		anz = scan.nextInt();
		
		while(zaehler < anz)
		{
			zaehler++;
			summe = summe + (1.0 / zaehler);
		}
		
		System.out.println(" ");
		System.out.println("Die Summe ist: " + summe);
	}
}