import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class AnredeVergeben {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		ArrayList<String> NameMann = new ArrayList<String>();
		ArrayList<String> NameFrau = new ArrayList<String>();
		String str = new String();
		char charAt;
		String strTeil1 = new String();

		NameMann.add("Elroy");
		NameMann.add("Fred");
		NameMann.add("Graham");

		NameFrau.add("Amy");
		NameFrau.add("Buffy");
		NameFrau.add("Cathy");

		do {

			System.out.print("Geben Sie einen Namen ein: ");
			str = scan.nextLine();

			for (int i = 0; i < str.length(); i++) {
				charAt = str.charAt(i);
				if (charAt == 32) {
					strTeil1 = str.substring(0, i);
				}
			}

			if (NameMann.contains(strTeil1)) {
				System.out.println("Mr. " + str);
			} else {
				if (NameFrau.contains(strTeil1)) {
					System.out.println("Ms. " + str);
				} else {
					System.out.println(str);
				}
			}

		} while (str.length() != 0);
		
		scan.close();
	}
}