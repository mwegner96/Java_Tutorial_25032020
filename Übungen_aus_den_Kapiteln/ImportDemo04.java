import java.util.*;

class ImportDemo04
{
  public static void main ( String[] args )
  {
    Scanner scan ;    // eine Klasse in java.util
    Random rand ;     // eine weitere Klasse in java.util
    
    int a;
    int b;

    scan = new Scanner( System.in );
    rand = new Random( );

    // mache etwas mit dem Scanner- und Random-Objekt (siehe folgende Kapitel)
    
    System.out.println("gebe etwas ein:");
    a = scan.nextInt();
    
    b = rand.nextInt(6);
  }
}
