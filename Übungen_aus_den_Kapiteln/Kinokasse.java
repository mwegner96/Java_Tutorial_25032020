import java.util.Scanner;
class Kinokasse
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int alter;

    System.out.println("Geben Sie das Alter an:");
    alter = scan.nextInt();

    if ( alter < 13 )
    {
      System.out.println("Jugendtarif");
    }
    else
    {
      System.out.println("Erwachsentarif");
    }
    System.out.println("Geniessen Sie die Show");    // wird immer ausgeführt
  }
}
