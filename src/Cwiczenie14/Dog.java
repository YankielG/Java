package Cwiczenie14;

    public class Dog extends Animal {
        private static int licnik;
        private static String rodzaj = "piesek";
        public Dog() {
            licnik++;
        }
        @Override
        int getInstanceNumber() {
            return licnik;
        }
        @Override
        String getType() {
            return rodzaj;
        }
    }


