import java.util.Scanner;

class ZahlenTester
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int zahl;

    System.out.println("Geben Sie ein Ganzzahl ein:");
    zahl = scan.nextInt();
    
    if ( zahl < 0 )
      System.out.println("Die Zahl " + zahl + " ist negativ");
    else
      System.out.println("Die Zahl " + zahl + " ist 0 oder positiv");
    
    System.out.println("Good-bye fuer jetzt");
  }
}
