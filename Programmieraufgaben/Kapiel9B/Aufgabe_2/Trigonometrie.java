class Trigonometrie
{
  public static void main (String[] args)
  {
	  
	  double zahl = 0.2345;
	  double sinx, cosx, ergebnis;
	  
	  sinx = Math.sin(zahl);
	  cosx = Math.cos(zahl);
	  
	  ergebnis = (sinx * sinx) + (cosx * cosx);
	  
	  System.out.println("Sinus: " + sinx + " Cosinus: " + cosx + " Ergebnis: " + ergebnis);
	  
  }
}