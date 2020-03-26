import java.util.Scanner;

public class QuadratKubik {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = 0, quadrat = 0, kubik = 0;
		
		System.out.print("Geben Sie n ein: ");
		n = scan.nextInt();
		
		System.out.println(" ");
		
		for(int i = 1; i <= n; i++)
		{
			quadrat += Math.pow(i, 2);
			kubik += Math.pow(i, 3);
		}
		
		System.out.println(" ");
		System.out.println("Die Quadratsumme ist: " + quadrat);
		System.out.println("Die Kubiksumme ist: " + kubik);
		
	}
}