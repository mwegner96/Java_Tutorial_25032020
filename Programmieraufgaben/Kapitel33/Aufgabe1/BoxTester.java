import java.util.Scanner;

class Box
{
	private double hoehe, breite, laenge;
	
	Box ( double breite, double hoehe, double laenge ) 
	{
		this.breite = breite;
		this.hoehe = hoehe;
		this.laenge = laenge;
	}
	
	Box ( double seite ) 
	{
		this.breite = seite;
		this.hoehe = seite;
		this.laenge = seite;
	}

	double berechneVolumen( ) 
	{
		return this.breite * this.hoehe * this.laenge;
	}
	
	double berechneOberflaeche( ) 
	{
		return (2 * (this.breite * this.hoehe + this.breite * this.laenge + this.hoehe * this.laenge)); 
	}
	
	double getLaenge()
	{
		return laenge;
	}
	
	double getBreite()
	{
		return breite;
	}
	
	double getHoehe()
	{
		return hoehe;
	}
}

class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Flaeche: "  + box.berechneOberflaeche( ) +
                         " Volumen: " + box. berechneVolumen( ) );

     System.out.println( "Laenge: " + box.getLaenge() +
                         " Hoehe: " + box.getHoehe() +
                         " Breite: " + box.getBreite() )  ;
  }
}