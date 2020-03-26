import java.util.Scanner;

public class Versandkosten {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int gewicht = 1;
		double kosten = 0.0;
		
		while(gewicht != 0)
		{
			kosten = 0;
			System.out.print("Gewicht der Sendung: ");
			gewicht = scan.nextInt();
			
			if (gewicht != 0)
			{
				if (gewicht <= 10)
				{
					kosten += 3;					
				}
				else 
				{
					kosten += 3;	
					
					for(int i = 11; i <= gewicht; i++)
					{
						kosten += 0.25;	
					}
				}
						
				System.out.println("Versandkosten: $" + kosten);
				System.out.println(" ");
			}
		}
			
		System.out.println("bye");
	}
}