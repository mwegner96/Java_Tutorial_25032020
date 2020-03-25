import java.util.Scanner;

class QuadratWurzel
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double zahl;

    // ein double einlesen
    System.out.print("Geben Sie ein double ein: ");
    zahl = scan.nextDouble();

    // Quadratwurzel berechnen
    double ergebnis = Math.sqrt( zahl );

    // Ergebnis ausgeben
    System.out.println("Quadratwurzel: " + ergebnis );
  }
}
