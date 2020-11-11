import java.util.Scanner;

public class String_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nume: ");
		String sir1 = scan.next();
		
		System.out.println("Prenume: ");
		String sir2 = scan.next();
		
		String sirConcat = sir1.concat(sir2);
		System.out.println(sirConcat);
		

	}

}
