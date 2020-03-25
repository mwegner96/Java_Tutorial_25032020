class StringDemo2
{
  public static void main ( String[] args )
  {
    String str, str2;
    int    len, len2;

    str = new String( "MMMMMM" );
    str2 = new String ("iiiiii");

    len = str.length();
    len2= str2.length();
    System.out.println("Die Laenge von str ist: " + len );
    System.out.println("Die Laenge von str2 ist: " + len2 );
  }
}