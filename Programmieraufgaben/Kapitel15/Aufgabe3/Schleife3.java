import java.util.Scanner;

public class Schleife3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String wort1 = new String();
		String wort2 = new String();
		int len1, len2;
		
		System.out.print("Geben Sie das erste Wort ein: ");
		wort1 = scan.nextLine();
		len1 = wort1.length();
		
		System.out.print("Geben Sie das zweite Wort ein: ");
		wort2 = scan.nextLine();
		len2 = wort2.length();
		
		System.out.println(" ");
		
		System.out.print(wort1);
		
		for (int i = len1 + 1; i < 30 - len2; i++)
		{
			System.out.print(".");
		}
		
		System.out.print(wort2);
	}
}