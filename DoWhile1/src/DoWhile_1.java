import java.util.Random;

public class DoWhile_1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int zar1,zar2;
		do {
			
			zar1 = rand.nextInt(6) + 1;
			zar2 = rand.nextInt(6) + 1;
			
			System.out.println("Zarul 1: " + zar1 + "\n" + "Zarul 2: " + zar2);
	
			
		}while(zar1 != zar2);
		
		System.out.println("S-a strigat dubla: " + zar1 + "," + zar2);

	}

}
