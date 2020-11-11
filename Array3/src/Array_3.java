import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] anArray;
		anArray = new int[10];
		
		for(int i = 0;i < anArray.length; i++) {
			System.out.println("Introdu un numar!");
			anArray[i] = scan.nextInt();
		}
		
		int suma = 0;
		
		for(int j = 0; j < anArray.length; j++) {
			
			suma += anArray[j];
			
		}
		System.out.println("Suma este: " + suma);
		
		
	}

}
