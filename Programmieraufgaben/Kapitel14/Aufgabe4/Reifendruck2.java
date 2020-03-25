import java.util.Scanner;

public class Reifendruck2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rv, rh, lv, lh;
		
		System.out.print("Reifendruck: rechter Vorderreifen: ");
		rv = scan.nextInt();
		
		if (rv < 35 || rv > 45)
		{
			System.out.println("Warnung: Der Reifendruck ist auﬂerhalb des erlaubten Bereichs!");
		}
		
		System.out.print("Reifendruck: linker Vorderreifen: ");
		lv = scan.nextInt();
		
		if (lv < 35 || lv > 45)
		{
			System.out.println("Warnung: Der Reifendruck ist auﬂerhalb des erlaubten Bereichs!");
		}
		
		System.out.print("Reifendruck: rechter Hinterreifen: ");
		rh = scan.nextInt();
		
		if (rh < 35 || rh > 45)
		{
			System.out.println("Warnung: Der Reifendruck ist auﬂerhalb des erlaubten Bereichs!");
		}
		
		System.out.print("Reifendruck: linker  Hinterreifen: ");
		lh = scan.nextInt();
		
		if (lh < 35 || lh > 45)
		{
			System.out.println("Warnung: Der Reifendruck ist auﬂerhalb des erlaubten Bereichs!");
		}
		
		if (rv == lv && rh == lh)
		{
			System.out.println("Reifendruck ist OK");
		}
		else
		{
			System.out.println("Reifendruck ist nicht OK");
		}
	}
}