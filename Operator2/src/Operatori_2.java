import java.util.Scanner;

public class Operatori_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your salary?");
		int salariuLunar = scan.nextInt();
		
		System.out.println("Ai primit mostenire?");
		System.out.println("1.Yes     2.No");
		int areMostenire = scan.nextInt();
		
		System.out.println("Membrii familiei?");
		int membriiFamilie = scan.nextInt();
		
		boolean estiBogat = true;
		
		if (areMostenire == 1 && salariuLunar > 10000 || salariuLunar / membriiFamilie > 2000) {
			
			estiBogat = true;
			
		}
		
		else {
			
			estiBogat = false;			
		
		}
		
		if (estiBogat == true) {
			
			System.out.println("Esti bogat!");
			
		}
		else {
			
			System.out.println("Saracie!");
			
		}

	}

}
