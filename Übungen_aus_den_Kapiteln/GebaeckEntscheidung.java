import java.util.Scanner ;
class GebaeckEntscheidung
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int hunger, aussehen, aroma ;

    System.out.print("Wie hungrig sind Sie            (1-10): ");
    hunger   = scan.nextInt();

    System.out.print("Wie lecker sieht das Gebaeck aus (1-10): ");
    aussehen = scan.nextInt();

    System.out.print("Wie gut riecht das Gebaeck (1-10): ");
    aroma    = scan.nextInt();

    if ( (hunger + aussehen + aroma ) > 15 )
      System.out.println("Gebaeck kaufen!" );

    System.out.println("Setzen Sie Ihren Einkauf fort.");
  }
}
