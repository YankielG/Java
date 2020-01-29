package Lab17;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        int i = ued.getNumberFromString("9d");
        System.out.println("Oto nasz liczba pomnoĹĽona przez 99: " + (i * 99));
    }

    public int getNumberFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            System.out.println("CoĹ› poszĹ‚o nie tak! Upewnij siÄ™, ĹĽe przekazywany string jest liczbÄ…!");
        }
        return -1;
    }
}