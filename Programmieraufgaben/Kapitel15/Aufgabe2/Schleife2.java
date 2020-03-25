import java.util.Scanner;

public class Schleife2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String wort = new String();
		int len;
		
		System.out.print("Geben Sie ein Wort ein: ");
		wort = scan.nextLine();
		len = wort.length();
		
		System.out.println(" ");
		
		for (int i = 1; i <= len; i++)
		{
			System.out.println(wort);
		}
		
	}
}