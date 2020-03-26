import java.util.Scanner;

public class Weihnachtsbaum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int anz;
		
		System.out.print("Hoehe Weihnachtsbaum: ");
		anz = scan.nextInt();
		
		System.out.println(" ");
		
		for (int i = 1; i <= anz - 3; i++)
		{
			for (int j = anz - 3 - 1; j >= i; j--)
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		for (int i = 1; i <= 3; i++)
		{
			for (int j = 1; j < anz - 4; j++)
			{
				System.out.print(" ");
			}
			System.out.print("###");
			System.out.print('\n');
		}
		
	}
}