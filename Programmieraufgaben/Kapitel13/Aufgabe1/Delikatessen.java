import java.util.Scanner;

public class Delikatessen {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String art = new String();
		double preis = 0, versandcost = 0, ges = 0;
		int versand;
		
		System.out.print("Geben Sie den Artikel ein: ");
		art = scan.nextLine();
		
		System.out.print("Geben Sie den Preis ein: ");
		preis = scan.nextDouble();
		
		System.out.print("Expressversand (0==nein, 1==ja): ");
		versand = scan.nextInt();
		
		if (preis < 10)
		{
			versandcost += 2.00;
		}
		else
		{
			versandcost += 3.00;
		}
		
		if (versand == 1)
		{
			versandcost += 5.00; 
		}
		
		ges = preis + versandcost;
		
		System.out.println("---- Rechnung ----");
		System.out.println(art + ": " + preis);
		System.out.println("Versand: " + versandcost);
		System.out.println("Gesamt:" + ges);
	}
}