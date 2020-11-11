import java.util.Scanner;

public class If_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu un numar intre 1 si 7:");
		int i = scan.nextInt();
		String rezultat;
		
		if(i ==1) {
			rezultat = "Luni";
		}else if(i ==2) {
			rezultat = "Marti";
		}else if(i ==3) {
			rezultat = "Miercuri";
		}else if(i ==4) {
			rezultat = "Joi";
		}else if(i ==5) {
			rezultat = "Vineri";
		}else if(i ==6) {
			rezultat = "Sambata";
		}else {
			rezultat = "Duminica";
		}
		
		System.out.println(rezultat);

	}

}
