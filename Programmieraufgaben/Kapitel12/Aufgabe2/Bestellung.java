import java.util.Scanner;

public class Bestellung {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int s,m,u;
		double gesBtr;
		final double ps = 0.05, pm = 0.03, pu = 0.01;
		
		System.out.print("Anzahl der Schrauben: ");
		s = scan.nextInt();
		
		System.out.print("Anzahl der Muttern: ");
		m = scan.nextInt();
		
		System.out.print("Anzahl der Unterlegscheiben: ");
		u = scan.nextInt();
		
		if (s > m)
		{
			System.out.println("Kontrollieren Sie Ihre Bestellung!");
		}
		
		gesBtr = s * ps + m * pm + u * pu;
		
		System.out.print("Gesamtbetrag: " + gesBtr);
	}
}