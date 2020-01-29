package Cwiczenie14;
    import java.util.Random;



    public class AnimalShelter {
        public static int kojec = 33;




        public static void main(String[] args) {
            Random random = new Random();
            Animal[] zwierzaki = new Animal[100];

            for(int a = 0; a < 100; a++) {
                int b = random.nextInt(5);
                switch (b) {
                    case 0:
                        zwierzaki[a] = new Dog();
                        break;
                    case 1:
                        zwierzaki[a] = new Cat();
                        break;
                    case 2:
                        zwierzaki[a] = new Elefant();
                    case 3:
                        zwierzaki[a] = new Mouse();

                }
            }
            System.out.println(kojec + " kojcu jest zwierzaczek - " + zwierzaki[kojec].getType());
            System.out.println("wszystkich zwierzaków jest " + zwierzaki[kojec].getInstanceNumber()+ " zwierzątka");


//            void show(){
//                System.out.println(kojec + " kojcu jest zwierzaczek - " + zwierzaki[kojec].getType());
//                System.out.println("wszystkich zwierzaków jest " + zwierzaki[kojec].getInstanceNumber()+ " zwierzątka");
//            }
//

        }
    }




