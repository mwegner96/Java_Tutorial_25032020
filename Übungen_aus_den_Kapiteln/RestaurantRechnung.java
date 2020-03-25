import java.util.Scanner;

class RestaurantRechnung
{
  public static void main (String[] args)

  {
    Scanner scan = new Scanner( System.in );
    double grundbetrag;

    System.out.print("Geben Sie den Grundbetrag ein: ");
    grundbetrag = scan.nextDouble();

    System.out.println("Grundbetrag " +  grundbetrag + " Gesamtbetrag: " +
         (grundbetrag + grundbetrag*0.06 + grundbetrag*0.2) );
  }
}
