import java.util.Scanner;

public class Operatori_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdu doua numere:");
		 double a = scan.nextDouble();
		 double b = scan.nextDouble();
		 
		 System.out.println("For the numbers " + a + " and " + b );
		 System.out.println("The result of adding is " + (a+b));
		 System.out.println("The result of subtracting is " + (a-b));
		 System.out.println("The result of multiplying is " + (a*b));
		 System.out.println("The result of dividing is " + (a/b));
		 System.out.println("The result of module is " + (a%b));
		 
 
	} 

}
