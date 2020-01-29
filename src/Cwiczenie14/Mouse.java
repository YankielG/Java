package Cwiczenie14;

public class Mouse extends Animal {
    private static int licnik;
    private static String rodzaj = "Myszka";
    public Mouse() {
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