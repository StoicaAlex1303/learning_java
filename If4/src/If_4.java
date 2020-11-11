import java.util.Scanner;

public class If_4 {

	public static void main(String[] args) {
		
		String s1 = citesteString();
		String s2 = citesteString();
	
	}
	
	public static String citesteString() {
		
		Scanner scan = new Scanner(System.in);
		String sir = scan.nextLine();
		return sir;
		
	}
	
	public static void comparaSirurile(String s1, String s2) {
		
		if(s1.equals(s2)) {
			System.out.println("Sirurile sunt la fel");
		}else {
			System.out.println("Sirurile sunt diferite");
		}
		
	}

}
