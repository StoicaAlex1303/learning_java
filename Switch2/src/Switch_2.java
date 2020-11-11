import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alege o zi");
		String zi = scan.nextLine();
		
		switch(zi) {
		
		case "Duminica" : System.out.println("Azi e zi libera");break;
		case "Luni" : System.out.println("Azi e prima zi de munca");break;
		case "Marti" : System.out.println("Azi sunt trei ceasuri rele. Not!");break;
		case "Miercuri" : System.out.println("Azi e mijlocul saptamanii");break;
		case "Joi" : System.out.println("Incepe sa se simta adierea vacantei");break;
		case "Vineri" : System.out.println("Ultima zi de munca. Ura!");break;
		case "Sambata" : System.out.println("Sambataaa!!!!");break;
		default : System.out.println("Nu ai ales o zi a saptamanii");break;
		
		}
	}

}
