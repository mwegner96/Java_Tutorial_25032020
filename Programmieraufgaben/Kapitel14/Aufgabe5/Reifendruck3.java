import java.util.Scanner;

public class Reifendruck3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rv, rh, lv, lh;

		System.out.print("Reifendruck: rechter Vorderreifen: ");
		rv = scan.nextInt();

		System.out.print("Reifendruck: linker Vorderreifen: ");
		lv = scan.nextInt();

		System.out.print("Reifendruck: rechter Hinterreifen: ");
		rh = scan.nextInt();

		System.out.print("Reifendruck: linker  Hinterreifen: ");
		lh = scan.nextInt();

		if ((rv <= (lv + 3) && rv >= (lv - 3)) && (lv <= (rv + 3) && lv >= (rv - 3))
				&& (rh <= (lh + 3) && rh >= (lh - 3)) && (lh <= (rh + 3) && lh >= (rh - 3))) {
			System.out.println("Reifendruck ist OK");
		} else {
			System.out.println("Reifendruck ist nicht OK");
		}
	}
}