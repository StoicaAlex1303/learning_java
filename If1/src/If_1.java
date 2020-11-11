import java.util.Scanner;

public class If_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu varsta:");
		int varsta = scan.nextInt();
		System.out.println(varsta < 18 ? "Esti minor" : "Esti major");

	}

}
