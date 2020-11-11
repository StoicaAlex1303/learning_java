public class Masina {
    public void marca(){
        System.out.println("N/A");
    }
    public void capacitateMotor(){
        System.out.println("N/A");
    }
    public void combustibil(){
        System.out.println("N/A");
    }
    public void model(){
        System.out.println("N/A");
    }
    public void nrUsi(){
        System.out.println("N/A");
    }

    public static class Tesla extends Masina {
        @Override
        public void marca() {
            System.out.println("Masina.Tesla");
        }

        public static class Model3 extends Tesla {
            @Override
            public void model() {
                System.out.println("Model 3");
            }

            @Override
            public void nrUsi() {
                System.out.println("5");
            }
        }

        public static class Roadster extends Tesla {
            @Override
            public void model() {
                System.out.println("Masina.Tesla.Roadster");
            }

            @Override
            public void nrUsi() {
                System.out.println("3");
            }
        }
    }

    public static class Volkswagen extends Masina {
        @Override
        public void marca() {
            System.out.println("Masina.Volkswagen");
        }

        public static class Golf extends Volkswagen {
            @Override
            public void model() {
                System.out.println("Masina.Volkswagen.Golf");
            }

            @Override
            public void nrUsi() {
                System.out.println("3");
            }

            @Override
            public void combustibil() {
                System.out.println("Benzina");
            }
            @Override
            public void capacitateMotor() {
                System.out.println("1.6");
            }

        }

        public static class Passat extends Volkswagen {
            @Override
            public void model() {
                System.out.println("Masina.Volkswagen.Passat");
            }

            @Override
            public void nrUsi() {
                System.out.println("5");
            }

            @Override
            public void combustibil() {
                System.out.println("Diesel");
            }
            @Override
            public void capacitateMotor() {
                System.out.println("2.0");
            }

        }
    }
}
