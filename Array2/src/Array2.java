
public class Array2 {

	public static void main(String[] args) {

		int[] anArray;
		anArray = new int[1000];
		
		for(int i = 0;i < anArray.length; i++) {
			anArray[i] = i;
			if(anArray[i] % 10 == 0) {
				System.out.println(anArray[i]);
			};
		}
		


	}

}
