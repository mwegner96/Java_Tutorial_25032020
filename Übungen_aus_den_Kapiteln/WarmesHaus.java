import java.util.Scanner;
class WarmesHaus
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int glasfaser, kunstschaum ;

    // Glasfaser einholen
    System.out.println("Wie viel Glasfaser?");
    glasfaser = scan.nextInt() ;

    // Kunststoffschaum einholen
    System.out.println("Wie viel Kunststoffschaum?");
    kunstschaum  = scan.nextInt() ;

    // überprüfen, ob mindestens eine Bedingung erfüllt ist
    if (glasfaser >= 4 || kunstschaum >= 3)
      System.out.println("Das Haus entspricht den Bauvorschriften!" );
    else
      System.out.println("Das Haus entspricht nicht den Vorschriften." );
  }
}
