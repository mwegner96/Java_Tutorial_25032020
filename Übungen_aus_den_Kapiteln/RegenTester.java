import java.util.Scanner;
class RegenTester
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    String antwort;

    System.out.print("Regnet es? (J oder N): ");
    antwort =  scan.nextLine();

    if ( antwort.equals("J") )  // ist antwort genau "J" ?
      System.out.println("Scheibenwischer An");  // True-Zweig
    else
      System.out.println("Scheibenwischer Aus"); // False-Zweig
  }
}
