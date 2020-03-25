import java.util.Scanner;

public class Dampf {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double eff, LTemp, DTemp;
		
		
		System.out.print("Geben Sie die Lufttemperatur ein: ");
		LTemp = scan.nextDouble();
		
		System.out.print("Geben Sie die Dampftemperatur ein: ");
		DTemp = scan.nextDouble();
		
		if (DTemp >= 373)
		{
		eff = 1 - LTemp / DTemp;
		}
		else
		{
			eff = 0;
		}
		System.out.print("Die Effizienz betraegt: " + eff);
	}
}