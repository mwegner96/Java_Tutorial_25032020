import java.util.Scanner;

public class Radius
{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		double radius;
		final double pi = Math.PI;
		double kreisflaeche;
		
		System.out.println("Geben Sie einen Radius ein:");
		radius = scan.nextDouble();
		
		kreisflaeche = pi * (radius * radius);
		
		System.out.println("Radius: " + radius);
		System.out.println("Flaecheninhalt: " + kreisflaeche);
		
	}

}