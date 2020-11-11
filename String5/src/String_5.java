import java.util.Scanner;

public class String_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sir1,sir2;
		
		
		System.out.println("Introdu primul sir de caractere");
		sir1 = scan.nextLine();
		
		System.out.println("Introdu al doilea sir de caractere");
		sir2 = scan.nextLine();
		
		Boolean egal = sir1.equals(sir2);		
		System.out.println(egal);		
		

	}

}
