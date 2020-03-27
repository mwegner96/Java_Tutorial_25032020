import java.util.Scanner;
import java.awt.*;
import java.lang.*;

public class TwoRef {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Point pt1 = new Point(10, 10);
		Point ptAlias = pt1;
		
		if (pt1 == ptAlias)
		{
			System.out.println("pt1 und ptAlias verweisen auf dasselbe Objekt!");
		}
		else
		{
			System.out.println("pt1 und ptAlias verweisen auf nicht dasselbe Objekt!");
		}

		System.out.println(" ");
		System.out.println("Point pt1 vorher: " + pt1.toString());
		System.out.println("Point ptAlias vorher: " + ptAlias.toString());
		
		pt1.move(2*pt1.x, 2*pt1.y);
		
		System.out.println(" ");
		System.out.println("Nur von ptAlias wurden die x- und y-Werte verdoppelt!");
		System.out.println(" ");
		
		System.out.println("Point pt1 vorher: " + pt1.toString());
		System.out.println("Point ptAlias vorher: " + ptAlias.toString());
		
		
		
	}
}