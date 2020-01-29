package Domowe_1;

public class NumberPresenter {

    public static void main(String[] args) {
        //deklaracja zmiennej lokalnej
        int i = 123;

        showInt(i);
        showIntAsBinary(i);
        showIntAsOctal(i);
        showIntAsHex(i);
    }

    public static void showInt(int i) {
        System.out.println("dziesietnie: \t" + i);
        System.out.println("------------------------");
    }

    public static void showIntAsBinary(int i) {
        System.out.println("binarnie: \t\t" + Integer.toBinaryString(i));
    }

    public static void showIntAsOctal(int i) {
        System.out.println("osemkowo: \t\t" + Integer.toOctalString(i));
    }

    public static void showIntAsHex(int i) {
        System.out.println("szesnastkowo: \t" + Integer.toHexString(i));
    }
}
