import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

class HalloObjekt {
	String mitteilung;

	HalloObjekt(String str) {
		mitteilung = str;
	}

	void sprich() {
		
		for (int i = 1; i <= mitteilung.length(); i++)
		{
		System.out.println(mitteilung);
		}
	}
}

class HalloTester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = new String();
		
		System.out.print("Geben Sie etwas ein: ");
		str = scan.nextLine();
		System.out.println();
		
		HalloObjekt objekt1 = new HalloObjekt(str);

		objekt1.sprich();
	}

}