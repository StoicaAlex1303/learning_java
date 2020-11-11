import java.util.Scanner;

public class For_123 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		////////////
		//For1//
		///////////
		
		/*for(int i = 0 ; i < 10; i++) {
			
			System.out.println("I know Java  " + i);
			
		}*/
		
		
        ////////////
		//For2//
		///////////
		
		/*System.out.println("Introdu un numar!");
		int x = scan.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println(i+1);
		}*/
		
		
        ////////////
		//For3//
		///////////
		
		System.out.println("Introdu un numar!");
		int x = scan.nextInt();
		for(int i = 1; i < x; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "    PAR  ");
				
			}else {
				System.out.println(i + "      IMPAR");
			}
		}
		

	}

}
