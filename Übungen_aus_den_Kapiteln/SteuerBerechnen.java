import java.util.Scanner;
class SteuerBerechnen
{
  public static void main (String[] args)
  {
    final double STEUERSATZ = 0.05;
    Scanner scan = new Scanner( System.in );
    double preis;
    double steuer;

    System.out.println("Geben Sie den Preis ein:");
    preis = scan.nextDouble();

    if ( preis >= 100  )
      steuer = preis * STEUERSATZ;
    else
      steuer = 0;

    System.out.println("Artikelpreis: " + preis +
        " Steuer: " + steuer + " Gesamt: " + (preis + steuer) );
  }
}
