import java.util.Scanner;

public class Citire_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu 3 numere:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double mediaAritmetica = (a + b + c) / 3;
		System.out.println("Media aritmetica este: " + mediaAritmetica);
		

	}

}
