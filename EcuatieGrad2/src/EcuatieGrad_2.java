import java.util.Scanner;

public class EcuatieGrad_2 {
	
	public static void main(String[] args) {
		
		//ax^2+bx+c=0
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdu valoarea lui a:");
		double a = scan.nextInt();
		
		System.out.println("Introdu valoarea lui b:");
		double b = scan.nextInt();
		
		System.out.println("Introdu valoarea lui c:");
		double c = scan.nextInt();
		
		System.out.println("Ecuatia este: " + a + "x^2 + " + b + "x +" + c + "= 0" );
		
		double delta = Math.pow(b, 2) - (4*a*c);
		
		System.out.println("Valoarea lui delta este: " + delta);
		
		double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
		
		double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
		
		//System.out.println("x1 = " + x1 +  " = " + (((-b) + Math.sqrt(delta))) + "/" + (2*a) + "\n" + "x2 = " + x2 +   " = " + (((-b) - Math.sqrt(delta))) + "/" + (2*a) );
		System.out.println("x1 =" + x1 + "\n" + "x2 = " + x2);
	}

}
