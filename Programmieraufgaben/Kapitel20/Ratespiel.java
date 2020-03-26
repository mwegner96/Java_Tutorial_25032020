import java.util.*;

public class Ratespiel {
	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int zufall = 0, raten = 0, zaehler = 0;
		
		System.out.println("-- Ratespiel --");
		System.out.println("Ich denke an eine Zahl von 1 bis 10.");
		System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
		System.out.println("Raten Sie!");
		
		zufall = rand.nextInt(10) + 1;
		
		while (zaehler < 3 || raten != zufall)
		{
			zaehler++;
			
			do
			{
				System.out.println("Versuch: " + zaehler);
				raten = scan.nextInt();
				
				if(raten > 10)
				{
					System.out.println("Zahl zu gross!");
				}
				
				if(raten < 1)
				{
					System.out.println("Zahl zu klein");
				}
				
			} while (raten < 1 || raten > 10);
			
			if (raten != zufall)
			{
					System.out.println("Falsch");
			}
			
			if (raten == zufall)
			{
				System.out.println("Richtig");
				System.out.println("Sie haben das Spiel gewonnen.");
				break;
			}
			
			if (zaehler == 3)
			{
				System.out.println("Die richtige Zahl war " + zufall);
				System.out.println("Sie haben das Spiel verloren.");
				break;
			}
				
		}
	}
}