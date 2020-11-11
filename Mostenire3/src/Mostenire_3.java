import java.util.Scanner;

public class Mostenire_3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu o marca de masina:");
        String marca = scan.next();
        if (marca.equals("Masina.Tesla")){
            System.out.println("Introdu modelul:");
            String model = scan.next();
            if (model.equals("Model 3")){

                Masina.Tesla.Model3 model3 = new Masina.Tesla.Model3();
                model3.marca();
                model3.model();
                model3.combustibil();
                model3.capacitateMotor();
                model3.nrUsi();
            }if (model.equals("Masina.Tesla.Roadster")){
                Masina.Tesla.Roadster roadster = new Masina.Tesla.Roadster();
                roadster.marca();
                roadster.model();
                roadster.combustibil();
                roadster.capacitateMotor();
                roadster.nrUsi();

            }else{
                System.out.println("Marca sau modelul este incorect!");
            }


        }


    }
}
