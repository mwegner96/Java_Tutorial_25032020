import java.util.Scanner;

public class y2k {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int gebJ, aktJ, alter;
		
		System.out.print("Geburtsjahr: ");
		gebJ = scan.nextInt();
		
		System.out.print("Aktuelles Jahr: ");
		aktJ = scan.nextInt();
		
		if (gebJ > aktJ)
		{
			alter = 100 - gebJ + aktJ;
		}
		else
		{
			alter = aktJ - gebJ;
		}
		
		System.out.print("Ihr Alter ist: " + alter);
	}
}