import java.util.Scanner;

public class SteinVonTurm {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double sek, e;
		double G = 9.81;
		
		System.out.print("Geben Sie die Anzahl der Sekunden ein: ");
		sek = scan.nextDouble();
		
		System.out.println(" ");
		
		e = 0.5 * G * sek*sek;
		
		System.out.println("Die Entfernung e betraegt: " + e + " Meter.");
				
	}
}