import java.util.Scanner;

public class Schleife1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int start, end;
		
		System.out.print("Startwert: ");
		start = scan.nextInt();
		
		System.out.print("Endwert: ");
		end = scan.nextInt();
		
		
		System.out.println(" ");
		
		for (int i = start; i <= end; i++)
		{
			System.out.println(i);
		}
		
	}
}