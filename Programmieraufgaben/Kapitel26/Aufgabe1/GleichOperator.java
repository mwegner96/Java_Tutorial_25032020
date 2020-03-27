import java.util.Scanner;

public class GleichOperator {
	public static void main(String[] args) {

		int anz = 0;
		String str1 = "Bo, die Katze";
		String str2 = "Bo, die Katze";
		String str3 = new String( "Fred, der Hund");
		String str4 = new String( "Fred, der Hund");
		
		if (str1 == str2)
		{
			anz++;
		}
		else
		{
			anz += 2;
		}
		
		if (str3 == str4)
		{
			anz++;
		}
		else
		{
			anz += 2;
		}
		
		System.out.println("Es wurden " + anz + " Objekte erzeugt.");
		
	}
}