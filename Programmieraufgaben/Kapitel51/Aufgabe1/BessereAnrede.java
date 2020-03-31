import java.util.Scanner;

abstract class Karte
{
  String empfaenger, anrede;
  
  Karte( String e, String sex)
  {
	  this.empfaenger = e;
	  if (sex.equals("w") || sex.equals("W"))
	  {
	  this.anrede = "Liebe";
	  }
	  else
	  {
		  if (sex.equals("m") || sex.equals("M"))
		  {
		  this.anrede = "Lieber";
		  }
		  else
		  {
			  this.anrede = "Liebes";
		  }
	  }
	  
  }
  
  public abstract void gruss();
}

class Feiertag extends Karte
{
  public Feiertag( String e, String sex )
  {
    super(e, sex);
    
  }

  public void gruss()
  {
    System.out.println(this.anrede + " " + this.empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}

class Geburtstag extends Karte
{
  int alter;

  public Geburtstag ( String e, String sex, int jahre )
  {
	  super(e, sex);
    alter = jahre;
  }

  public void gruss()
  {
    System.out.println(this.anrede + " " + this.empfaenger + ",\n");
    System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
  }
}

class Valentin extends Karte
{
  int kuesse;

  public Valentin ( String e, String sex,int k )
  {
	  super(e, sex);
    kuesse     = k;
  }

  public void gruss()
  {
    System.out.println(this.anrede + " " + empfaenger + ",\n");
    System.out.println("herzliche Gruesse und Kuesse,\n");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
    System.out.println("\n\n");
  }
}

public class BessereAnrede
{
  public static void main ( String[] args )
  {
    String name, geschlecht;
    Scanner scan = new Scanner( System.in );

    System.out.println("Ihr Name");
    name = scan.nextLine();
    System.out.println();
    System.out.println("Ihr Geschlecht <m> <w>");
    geschlecht = scan.nextLine();

    Karte   feiern = new Feiertag( name, geschlecht );
    feiern.gruss();

    Karte  geb  = new Geburtstag( name, geschlecht, 21 );
    geb.gruss();

    Karte val = new Valentin( name, geschlecht, 7 );
    val.gruss();

  }
}