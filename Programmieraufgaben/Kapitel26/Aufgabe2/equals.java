import java.util.Scanner;

public class equals {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int zahl = 0, summe = 0, zaehler = 0;
		String eingabe; 
		final String antwortJa = "ja", antwortNein = "nein";
		boolean JaNein = false;
		
		do
		{
		System.out.print("Eingabeaufforderung <ja> oder <nein>? ");
		eingabe = scan.nextLine();
		
		if (!eingabe.equals(antwortJa) && !eingabe.equals(antwortNein))
		{
			System.out.println("Eingabe ungueltig!");
			System.out.println(" ");
		}
		
		if (eingabe.equals(antwortJa))
		{
			JaNein = true;
		}
		
		if (eingabe.equals(antwortNein))
		{
			JaNein = false;
		}
		
		} while (!eingabe.equals(antwortJa) && !eingabe.equals(antwortNein));
		
		System.out.println(" ");
		
		while (zaehler < 5)
		{
			zaehler++;
			
			if (JaNein == true)
			{
				System.out.print("Geben Sie " + zaehler + " Zahl ein: ");
				zahl = scan.nextInt();
				
				summe += zahl;
			}
			else
			{
				zahl = scan.nextInt();
				
				summe += zahl;
			}
		}
		
		System.out.println(" ");
		System.out.println("Gesamtsumme: " + summe);
	
	}
}