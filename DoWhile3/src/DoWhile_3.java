import java.util.Scanner;

public class DoWhile_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x =1,y = 1;
		String operatie;
		
		while (x != 0 && y != 0) {
			
			System.out.println("Scrie operatia:");
			x = scan.nextInt();
			operatie = scan.next();
			y = scan.nextInt();
			
			/*System.out.println("Scrie primul numar: ");
			x = scan.nextInt();
			//System.out.println(x);
			
			System.out.println("Scrie operatia: ");
			operatie = scan.next();
			//System.out.println(operatie);
			
			
			System.out.println("Scrie al doilea numar: ");
			y = scan.nextInt();
			//System.out.println(y);*/
			
		
			switch(operatie) {
			case "+": System.out.println("Rezultatul adunarii este: " + (x+y));break;
			case "-": System.out.println("Rezultatul scaderii este: " +(x-y));break;
			case "*": System.out.println("Rezultatul inmultirii este: "+(x*y));break;
			case "/": System.out.println("Rezultatul impartirii este: "+(x/y));break;
			default : System.out.println("Operatia nu este corecta!");
			}
			/*if(operatie == "+"){
				System.out.println("Rezultatul adunarii este: " + (x+y));
			}
			if(operatie == "-") {
				System.out.println("Rezultatul scaderii este: " +(x-y));
			}
			if(operatie == "/") {
				System.out.println("Rezultatul impartirii este: "+(x/y));
			}
			if(operatie == "*") {
				System.out.println("Rezultatul inmultirii este: "+(x*y));
			}*/
			
			
				
		}


	}

}
