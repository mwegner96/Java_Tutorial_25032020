import java.util.Scanner;

class ZahlenTester2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int zahl;

    System.out.println("Geben Sie eine Ganzzahl ein:");
    zahl = scan.nextInt();

    if ( zahl < 0 )
    {
      // True-Zweig
      System.out.println("Die Zahl " + zahl + " ist negativ");

    }
    else
    {
      if ( zahl > 0 )
      {
        // verschachtelter True-Zweig
        System.out.println("Die Zahl " + zahl + " ist positiv");
      }
      else
      {
        // verschachtelter False-Zweig
        System.out.println("Die Zahl " + zahl + " ist 0");
      }

    }

    System.out.println("Good-bye fuer jetzt");    // wird immer ausgeführt
  }
}
