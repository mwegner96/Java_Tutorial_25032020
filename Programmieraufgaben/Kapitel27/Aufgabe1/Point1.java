import java.util.Scanner;
import java.awt.*;


public class Point1 {
	public static void main(String[] args) {

		int x1, x2, y1, y2;
		Scanner scan = new Scanner(System.in);
		Point point1 = new Point();
		Point point2 = new Point();
		
		System.out.print("Wert x1: ");
		x1 = scan.nextInt();
		
		System.out.print("Wert x2: ");
		x2 = scan.nextInt();
		
		System.out.print("Wert y1: ");
		y1 = scan.nextInt();
		
		System.out.print("Wert y2: ");
		y2 = scan.nextInt();
		
		point1.move(x1, y1);
		point2.move(x2, y2);
		
		
		System.out.println(point1.toString());
		System.out.println(point2.toString());
	}
}