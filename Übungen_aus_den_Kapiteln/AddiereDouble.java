import java.util.Scanner;

class AddiereDouble
{
  public static void main (String[] args)
  {
    double erster, zweiter, summe;
    Scanner scan = new Scanner( System.in );

    // erstes double einlesen
    System.out.print("Geben Sie das erste double ein: ");
    erster = scan.nextDouble();

    // zweites double einlesen
    System.out.print("Geben Sie das zweite double ein: ");
    zweiter = scan.nextDouble();

    // Summe berechnen und ausgeben
    summe = erster + zweiter;
    System.out.print("Summe: " + summe );
  }
}
