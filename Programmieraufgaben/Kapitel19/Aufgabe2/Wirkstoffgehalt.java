import java.util.Scanner;

public class Wirkstoffgehalt  {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double wirk = 100.0;
		int mon = 0;
		
		System.out.println("Monat: " + mon + "  Wirkstoffgehalt: " + wirk);
		
		while (wirk > 50)
		{
			mon++;
			wirk = wirk * 0.96;
			
			if (wirk > 50)
			{
			System.out.println("Monat: " + mon + "  Wirkstoffgehalt: " + wirk);
			}
			else
			{
				System.out.println("Monat: " + mon + "  Wirkstoffgehalt: " + wirk + "  ABEGELAUFEN!");
			}
		}
		
	}
}