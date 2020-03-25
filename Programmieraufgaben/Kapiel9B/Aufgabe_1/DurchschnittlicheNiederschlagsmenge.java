class DurchschnittlicheNiederschlagsmenge
{
  public static void main (String[] args)
  {

	  int april = 12, mai = 14, juni = 8;
	  double ergebnis;
	  
	  ergebnis = (april + mai + juni) / 3.0;
	  
	  System.out.println("Niederschlag im April \t: \t" + april);
	  System.out.println("Niederschlag im Mai \t: \t" + mai);
	  System.out.println("Niederschlag im Juni \t: \t" + juni);	  
	  System.out.println("Durchschnitt \t\t: \t" + ergebnis);
	  
  }
}