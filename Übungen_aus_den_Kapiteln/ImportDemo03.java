import java.util.Scanner;

class ImportDemo03
{
  public static void main ( String[] args )
  {
    Scanner scan ;
    int a;
    scan = new Scanner( System.in );

    // mache etwas mit dem Scanner-Objekt (siehe nächstes Kapitel)
    System.out.println("gebe etwas ein: ");
    a = scan.nextInt();
  }
}
