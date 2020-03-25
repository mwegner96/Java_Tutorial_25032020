import java.util.Scanner;

public class Logarithmus {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double x, n;
		
		System.out.print("Geben Sie ein double ein: ");
		x = scan.nextDouble();
		
		System.out.println(" ");
		
		n = (Math.log(x)) / (Math.log(2));
		
		System.out.println("Der Zweierlogarithmus von "+ x + " ist " + n);
		
	}
}