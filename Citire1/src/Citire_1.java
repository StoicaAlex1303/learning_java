import java.util.Scanner;

public class Citire_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cum te cheama?");
		String nume = sc.next();
		System.out.println("Numele tau este:" + nume);
		System.out.println("Cati ani ai?");
		int varsta=sc.nextInt();
		System.out.println("Varsta ta este:" + varsta);
		System.out.println("Ce salariu ai?");
		int salariu=sc.nextInt();
		System.out.println("Salariul tau este:" + salariu);
		

	}

}
