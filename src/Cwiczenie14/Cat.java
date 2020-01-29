package Cwiczenie14;

    public class Cat extends Animal {
        private static int licnik;
        private static String rodzaj = "kotek";
        public Cat() {
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


