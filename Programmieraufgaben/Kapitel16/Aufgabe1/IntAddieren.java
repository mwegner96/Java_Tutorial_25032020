import java.util.Scanner;

public class IntAddieren {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int anz = 0, zaehler = 0, summe = 0, add = 0;
		
		System.out.print("Wie viele Integer sollen addiert werden: ");
		anz = scan.nextInt();
		
		while (zaehler < anz)
		{
			zaehler++;
			System.out.print("Geben Sie einen Integer ein: ");
			add = scan.nextInt();
			
			summe = summe + add;
		}
		
		System.out.print("Die Summe ist " + summe);
		
	}
}