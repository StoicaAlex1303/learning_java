import java.util.Scanner;

public class Metode_3 {

	public static void main(String[] args) {
		
		int numar = citesteNumar();
		int putere = power(numar);
		
		int i;
		for(i = putere; i >= 0; i--) {
			
			System.out.println("Numarul la putere " + i + " este egal cu " + Math.pow(numar, i));
			
		}
		
	}
	
	public static int citesteNumar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu un numar: ");
		int x = scan.nextInt();		
		return x;
		
	}
	
	public static int power(int numar) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Puterea: ");
		int y = scan.nextInt();
		return y;
		
	}
	

}
