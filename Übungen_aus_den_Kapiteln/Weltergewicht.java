// Gewichtsklasse überprüfen
//
// Boxer muss zwischen 136 und 147 Pfund wiegen
//
import java.util.Scanner;

class Weltergewicht
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int    gewicht;

    // Gewicht einholen
    System.out.println("Wie schwer ist der Boxer?");

    gewicht = scan.nextInt();

    // überprüfen, ob das Gewicht innerhalb des Bereichs liegt
    if (gewicht >= 136 && gewicht <= 147)
      System.out.println("Im Bereich!" );
    else
      System.out.println("Ausserhalb des Bereichs." );
  }
}
