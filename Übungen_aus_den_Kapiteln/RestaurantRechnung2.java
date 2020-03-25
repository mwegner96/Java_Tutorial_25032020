import java.util.Scanner;

class RestaurantRechnung2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double grundbetrag;
    double trinkgeld;

    System.out.print("Geben Sie den Grundbetrag ein: ");
    grundbetrag = scan.nextDouble();
    System.out.print("Geben Sie das Trinkgeld ein (z.B. 0.1 für 10 Prozent): ");
    trinkgeld = scan.nextDouble();

    System.out.println("Grundbetrag " +  grundbetrag + " Gesamtkosten: " +
         (grundbetrag + grundbetrag*0.06 + grundbetrag*trinkgeld) );
  }
}
