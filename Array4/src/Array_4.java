import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] lista;
		
		System.out.println("Cati invitati ai?");
		int x = scan.nextInt();
		
		lista = new String[x];
		
		for(int i = 0;i < x; i++) {
			
			System.out.println("Introdu numele invitatului: ");
			
			String nume = scan.nextLine();
			lista[i] = nume;
			
		}
		System.out.println("Lista cu invitati este:");
		for(int j = 0;j < x; j++) {
			
			System.out.println((j+1) + "." + lista[j]);
			
		}

	}

}
