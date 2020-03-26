import java.util.Scanner;

public class Ratenzahlung {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int monat = 0;
		double monZins = 0, anfangSaldo = 0, saldo = 1, gesBtr = 0, monBetr = 0, schulden = 0;

		System.out.print("Geben Sie Ihr Anfangssaldo ein: ");
		anfangSaldo = scan.nextDouble();

		System.out.print("Geben Sie den monatlichen Zinssatz ein: ");
		monZins = scan.nextDouble();

		System.out.print("Geben Sie den Rueckzahlungsbetrag ein: ");
		schulden = scan.nextDouble();

		System.out.print("Geben Sie den monatlichen Betrag ein: ");
		monBetr = scan.nextDouble();

		System.out.println(" ");

		saldo = anfangSaldo;

		while (saldo > 0) {
			gesBtr += monBetr;
			monat++;
			schulden = schulden * (1.0 + (monZins / 100));
			saldo = schulden - monBetr;
			schulden -= monBetr;

			if (saldo < schulden) {
				while (saldo > 0)
				{
					saldo -= 0.0001;
					schulden -= 0.0001;
					gesBtr += 0.0001;
				}
			}

			System.out.println("Monat: " + monat + "   Saldo: " + saldo + "   Gesamtbetrag: " + gesBtr + "   Schulden: " + schulden);
		}

	}
}