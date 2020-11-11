import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alegeti o zi (introduceti numarul)");
		System.out.print("0. Duminica " + "\n"
		               + "1. Luni" + "\n"
		               + "2. Marti" + "\n"
		               + "3. Miercuri" + "\n"
		               + "4. Joi" + "\n"
		               + "5. Vineri" + "\n"
		               + "6. Sambata" + "\n"
		               );
		int nrZi = scan.nextInt();
		
		switch(nrZi) {
		
		case 0 : System.out.println("Azi e zi libera");break;
		case 1 : System.out.println("Azi e prima zi de munca");break;
		case 2 : System.out.println("Azi sunt trei ceasuri rele. Not!");break;
		case 3 : System.out.println("Azi e mijlocul saptamanii");break;
		case 4 : System.out.println("Incepe sa se simta adierea vacantei");break;
		case 5 : System.out.println("Ultima zi de munca. Ura!");break;
		case 6 : System.out.println("Sambataaa!!!!");break;
		default : System.out.println("Nu ai ales o zi a saptamanii");break;
		
		}
	}

}
