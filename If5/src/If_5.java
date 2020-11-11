import java.util.Scanner;

public class If_5 {

	public static void main(String[] args) {
		
		int age = citireaVarstei();
		verificareaVarstei(age);
		int day = citireaZilei();
		verificareaZilei(day);
		String s1 = introduSirDeCaractere();
		String s2 = introduSirDeCaractere();
		verificareSiruri(s1, s2);
		
	}
	
	public static int citireaVarstei() {		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Varsta");
		int varsta = scan.nextInt();
		return varsta;
	}
	
	public static void verificareaVarstei(int age) {
		if(age < 16) {
			System.out.println("Nu poti conduce");
		}else if(age < 18) {
			System.out.println("Nu poti vota");
		}else if(age < 25) {
			System.out.println("Nu poti inchiria masina");
		}else {
			System.out.println("Poti face tot ce este legal");
		}
	
	}
	
	public static int citireaZilei() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdu un numar");
		int zi = scan.nextInt();
		return zi;
		
	}

	public static String verificareaZilei(int day) {
		
		String zi;
		if(day == 1) {
			zi = "Luni";
		}else if (day == 2) {
			zi = "Marti";
		}else if (day == 3) {
			zi = "Miercuri";
		}else if (day == 4) {
			zi = "Joi";
		}else if (day == 5) {
			zi = "Vineri";
		}else if (day == 6) {
			zi = "Sambata";
		}else  {
			zi = "Duminica";
		}
		
		System.out.println(zi);
		return zi;
		
	}
	public static String introduSirDeCaractere() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu un sir de caractere");
		String sir = scan.nextLine();
		return sir;
	}
	
	public static void verificareSiruri(String s1, String s2) {
		
		if(s1.equals(s2)) {
			System.out.println("Sirurile sunt identice");
		}else {
			System.out.println("Sirurile sunt diferite");
		}
		
	}
}
