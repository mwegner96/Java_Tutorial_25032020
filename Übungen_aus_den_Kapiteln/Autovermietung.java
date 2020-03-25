// Autovermietung
//
import java.util.Scanner;
class Autovermietung
{
  public static void main (String[] args)
  {
    // Einen Scanner und zwei Integer-Variable deklarieren
    Scanner scan = new Scanner( System.in );
    int alter, kredit;

    // das Alter des Mieters abfragen
    System.out.println("Wie alt sind Sie?");
    alter = scan.nextInt() ;

    // den Kreditrahmen abfragen
    System.out.println("Wie viel Kredit haben Sie?");
    kredit = scan.nextInt() ;

    // überprüfen, ob beide Anforderungen erfüllt sind
    if (alter>=21 && kredit>=10000)
      System.out.println("Genug, um dieses Auto zu mieten!" );
    else
      System.out.println("Wie waere es mit einem Fahrrad?" );
  }
}
