class StringDemo3
{
  public static void main ( String[] args )
  {
	  
	  int parameter1 = 0, parameter2;
    String str = new String( "Golf is a good walk spoiled." ); // erzeuge das originale Stringobjekt
    
    parameter2 = str.length()-1;

    String sub = str.substring(parameter1, parameter2); // erzeuge ein neues Objekt aus dem Original

    System.out.println( sub );

    // Start Index = End Index -> Leere Ausgabe
    // Start Index < 0 wirft einen Fehler
    // End Index > Anzahl der Zeich wirft einen Fehler
    // Umkehr der Parameter wirft einen Fehler
  }
}