import java.util.Scanner;
import java.awt.*;
import java.lang.*;

public class pointObj {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Point pt1 = new Point(10, 10);
		Point pt2 = new Point(30, 30);
		
		int flaeche = Math.abs(pt1.x - pt2.x) * Math.abs(pt1.y - pt2.y);
		
		System.out.println("Die Flaeche betraegt: " + flaeche);
		
		
		
		
	}
}