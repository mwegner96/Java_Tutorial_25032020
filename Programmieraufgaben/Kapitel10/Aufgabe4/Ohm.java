import java.util.Scanner;

public class Ohm {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double i, u, r;
		
		System.out.print("Geben Sie die Spannung U ein: ");
		u = scan.nextDouble();
		
		System.out.println(" ");
		
		System.out.print("Geben Sie den Wiederstand ein: ");
		r = scan.nextDouble();
		
		i = (u + 0.0)/r;
		
		System.out.println(" ");
		System.out.print("Die Stromstaerke I betraegt: " + i + " Ampere.");
	}
}