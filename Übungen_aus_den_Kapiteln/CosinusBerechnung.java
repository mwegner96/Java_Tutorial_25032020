import java.util.*;

class CosinusBerechnung
{
  public static void main (String[] args)
  {
    double zahl;
    Scanner scan = new Scanner( System.in );

    System.out.print("Bogenmass eingeben: ");
    zahl = scan.nextDouble();

    // Cosinus berechnen
    double ergebnis = Math.cos( zahl );

    // Ergebnis ausgeben
    System.out.println("Cosinus: " + ergebnis );
  }
}
