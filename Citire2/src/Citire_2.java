import java.util.Scanner;

public class Citire_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cum te cheama?");
		String nume = scan.next();
		
		System.out.println("Ce varsta ai?");
		short varsta = scan.nextShort();
		
		System.out.println("Ce ocupatie ai?");
		String job = scan.next();
		
		System.out.println("Cati puradei ai?");
		short puradei = scan.nextShort();
		
		System.out.println("Ce masina conduci?");
		String masina = scan.next();
		
		System.out.println("Te cheama " + nume + " ai " + varsta + " ani si ai ocupatia de " + job +". Ai " + puradei + " de copii si conduci un " + masina);
		
		return;
		

	}

}
