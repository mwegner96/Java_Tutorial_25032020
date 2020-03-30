import java.util.Scanner;
import java.awt.*;
import java.lang.*;

public class charAt {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = new String();

		System.out.print("Geben Sie einen String ein: ");
		str = scan.nextLine();

		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}
}