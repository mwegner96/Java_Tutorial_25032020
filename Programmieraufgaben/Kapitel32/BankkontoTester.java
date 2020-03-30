class Bankkonto
{
  // Instanzvariablen
  String kontonummer;
  String kontoinhaber;
  int    kontostand;

  // Konstruktoren
  Bankkonto( String ktoNummer, String ktoInhaber, int start )
  {
    kontonummer  = ktoNummer;
    kontoinhaber = ktoInhaber;
    kontostand     = start;
  }

  // Methoden
  int aktuellerKontostand()
  {
     return kontostand;
  }
}

class BankkontoTester
{
  public static void main( String[] args )
  {
    Bankkonto konto1 =
        new Bankkonto( "123", "Bob", 100 );
    Bankkonto konto2 =
        new Bankkonto( "92a-44-33", "Kathy Emerson", 0 );
    System.out.println( konto1.kontonummer + " " +
        konto1.kontoinhaber + " " + konto1.aktuellerKontostand() );
    System.out.println( konto2.kontonummer + " " +
        konto2.kontoinhaber + " " + konto2.aktuellerKontostand() );
  }
}