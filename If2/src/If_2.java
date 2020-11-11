import java.util.Scanner;

public class If_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Varsta:");
		int varsta = scan.nextInt();
		
		if(varsta < 16) {
			System.out.println("Nu poti conduce.");			
		}else if (varsta < 18){			
			System.out.println("Nu poti vota.");			
		}else if (varsta < 25) {			
			System.out.println("Nu poti inchiria masina.");			
		}else {			
			System.out.println();			
		}

	}

}
