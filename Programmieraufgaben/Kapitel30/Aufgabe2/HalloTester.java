import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

class HalloObjekt {
	String mitteilung;


	void sprich1() {
		
		System.out.println("Guten Morgen Welt!");

	}
	
void sprich2() {
		
		System.out.println("Guten Abend Welt!");

	}
}

class HalloTester {
	public static void main(String[] args) {
		
		HalloObjekt objekt1 = new HalloObjekt();

		objekt1.sprich1();
		objekt1.sprich2();
	}

}