import java.util.Random;
import java.util.Scanner;

public class DoWhile_2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int x = rand.nextInt(50);
		int y;
		System.out.println(x);
		do {
			
			System.out.println("Ghiceste numarul:");
			y = scan.nextInt();
			if(y > x){
				System.out.println("Numarul introdus este prea mare!");
			}
			if(y < x){
				System.out.println("Numarul introdus este prea mic!");				
			}
			if (y == x) {
				System.out.println("Felicitari!Ai un os");
			}
			
		}while(x != y);

	}

}
