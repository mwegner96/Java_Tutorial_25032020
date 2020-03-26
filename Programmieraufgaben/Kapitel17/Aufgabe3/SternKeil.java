import java.util.Scanner;

public class SternKeil {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int anz;
		
		System.out.print("Anfangszahl der Sterne: ");
		anz = scan.nextInt();
		
		System.out.println(" ");
		
		for (int i = 1; i <= anz; i++)
		{
			for (int j = anz + 1 - i; j >= 1; j--)
			{
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
	}
}