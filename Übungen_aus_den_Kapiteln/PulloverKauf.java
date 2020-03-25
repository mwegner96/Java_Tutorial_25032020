import java.util.Scanner;
class PulloverKauf
{
  public static void main (String[] args)
  {
    final int PREIS = 4495;    // Preis in Pennies

    Scanner scan = new Scanner( System.in );

    int    bargeld;

    System.out.println("Wie viel haben Sie, in Pennies?");
    bargeld   = scan.nextInt();

    if (bargeld < PREIS)
    {
      System.out.println("Sie koennen den Pullover nicht kaufen." );
      System.out.println("Sie brauchen $" +
        (PREIS-bargeld)/100 + "." + (PREIS-bargeld)%100 + " mehr." );
    }
    else
       System.out.println("Sie koennen den Pullover kaufen.");
  }
}
