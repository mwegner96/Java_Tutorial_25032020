import java.util.Scanner;

public class TortenEssen {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int gewicht;
		
		System.out.print("Geben Sie ihr Gewicht ein: ");
		gewicht = scan.nextInt();
		
		if (gewicht > 234 && gewicht < 266)
		{
			System.out.println("Zugelassen.");
		}
		else
		{
			System.out.println("Nicht Zugelassen.");
		}
	}
}