package Cwiczenie14;

    public class Elefant extends Animal {
        private static int licnik;
        private static String rodzaj = "słonik";
        public Elefant() {
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


