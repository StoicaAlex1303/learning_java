import java.util.Scanner;
 
public class For_4 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate numere vrei sa aduni?");
        int n = sc.nextInt();
        int suma = 0;
 
        for(int i = 0; i < n; i++) {
            System.out.println("Introdu urmatorul numar:");
            int numar = sc.nextInt();
            suma += numar;
        }
 
        System.out.println("Suma numerelor introduse este " + suma);
    }
 
}