import java.util.Scanner;

public class CentDollar {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cent, dollar;
		
		System.out.print("Geben sie ihren Centbetrag ein:");
		cent = scan.nextInt();
		
		dollar = cent / 100;
		
		cent = cent % 100;
		
		System.out.println("Das ergibt " + dollar + "  Dollar und " + cent + " Cent.");
	}

}