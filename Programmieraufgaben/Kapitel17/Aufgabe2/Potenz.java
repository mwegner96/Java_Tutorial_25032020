import java.util.Scanner;

public class Potenz {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double x, erg;
		int n;
		
		System.out.print("Geben Sie x ein: ");
		x =  scan.nextDouble();
		
		System.out.print("Geben Sie n ein: ");
		n =  scan.nextInt();
		
		erg = Math.pow(x, n);
		
		System.out.println(" ");
		System.out.println(x + " hoch " + n + " ergibt: " + erg);
	}
}