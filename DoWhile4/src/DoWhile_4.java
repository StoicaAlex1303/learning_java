import java.util.Scanner;

public class DoWhile_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numar;
		System.out.println("Introdu un numar. Numerele pare vor fi adunate cu totalul, "
		                    + "iar cele impare vor fi inmultite");
		 
		int total = 0;
		int numarUser;
		do {
			
			numarUser = scan.nextInt();
			if(numarUser % 2 == 0) {
				total += numarUser;
				//System.out.println(total);
			}else {
				total *= numarUser;
				//System.out.println(total);
			}
			
			 System.out.println("Total pana acum: " + total);
			 System.out.println("Introdu alt numar sau cifra 0 pentru a incheia programul");
			 System.out.println();
			
			
		}while(numarUser != 0);
		
		

	}

	

}
