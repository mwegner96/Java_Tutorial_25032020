import java.util.Scanner;
class AutoKauf
{
  public static void main (String[] args)
  {
    final int GRUNDPREIS       = 20000; // Basispreis in Dollar
    final int ZIERLEISTENPREIS =   250; // Preis der Zierleisten
    final int ABS_PREIS        =   800; // Preis für ABS


    Scanner scan = new Scanner( System.in );

    int    antwort;
    int    gesamtpreis = GRUNDPREIS;

    System.out.print("Wollen Sie Zierleisten (0 oder 1)? ");

    antwort = scan.nextInt();
    if (antwort == 1)
    {
      gesamtpreis = gesamtpreis + ZIERLEISTENPREIS;
    }

    System.out.print("Wollen Sie ein Antiblockiersystem (0 oder 1)? ");
    antwort = scan.nextInt();
    if (antwort == 1)
    {
      gesamtpreis = gesamtpreis + ABS_PREIS;
    }

    System.out.println("Der Gesamtpreis ist: $" + gesamtpreis );
  }
}
