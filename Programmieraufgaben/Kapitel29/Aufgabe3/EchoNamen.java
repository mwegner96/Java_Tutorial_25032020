import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class EchoNamen {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char charAt; 
		String str = new String();
		String strTeil1 = new String();
		String strTeil2 = new String();
		
		System.out.print("Geben Sie Ihren vollstaendigen Namen ein: ");
		str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {
			charAt = str.charAt(i);
			if (charAt == 32) {
				strTeil1 = str.substring(0, i);
				strTeil2 = str.substring(i + 1, str.length());
				strTeil2 = strTeil2.toUpperCase();
			}
		}
		
		System.out.println();
		System.out.print(strTeil1 + " " + strTeil2);
		
	}
}