import java.util.Scanner;

public class String_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nume;
		System.out.println("Cum te cheama?");
		nume = scan.next();
		System.out.println("Primul caracter este: " +nume.charAt(0));
		System.out.println("Ultimul caracter este: " +nume.charAt(nume.length() - 1));
		System.out.println(nume.length());

	}

}
