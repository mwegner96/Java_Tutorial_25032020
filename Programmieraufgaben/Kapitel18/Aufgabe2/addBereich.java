import java.util.Scanner;

public class addBereich {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int oben = 0, unten = 0, daten = 1, summein = 0, summeout = 0;
		
		System.out.println("--- Bereiche addieren ---");
		System.out.print("Untergrenze des Bereichs: ");
		unten = scan.nextInt();
		
		System.out.print("Obergrenze  des Bereichs: ");
		oben = scan.nextInt();
		System.out.println(" ");
		
		while(daten != 0)
		{
			System.out.print("Daten eingeben: ");
			daten = scan.nextInt();
			
			if (daten != 0)
			{
				if (daten >= unten && daten <= oben)
				{
					summein += daten;
				}
				else 
				{
					summeout += daten;
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("Summe der Werte innerhalb des Bereichs: " + summein);
		System.out.println("Summe der Werte ausserhalb des Bereichs: " + summeout);
	}
}