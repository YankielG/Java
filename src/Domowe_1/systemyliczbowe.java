package Domowe_1;

public class systemyliczbowe {

    public static void main(String[] args) {

        int a=3;
        int b=4;
        int c=5;
        int d=6;

        dodaj(a,b);
        odejmij(c,d);
        pomnoz(a,c);
        podziel(d,c);

    }


    public static void dodaj( int a, int b){

        System.out.println("+++ DODAWANIE +++");
        int dodawana= a+b;
        System.out.println("suma " + a + " + "+ b + " równa jest : "+ dodawana);
        System.out.println("BIN: ");
        System.out.println("a : "+ showIntAsBINary(a));
        System.out.println("b : "+ showIntAsBINary(b));
        System.out.println("a+b : "+ showIntAsBINary(dodawana));
        System.out.println("OCT : ");
        System.out.println("a : "+ showIntAsOctal(a));
        System.out.println("b : "+ showIntAsOctal(b));
        System.out.println("a + b : "+ showIntAsOctal(dodawana));
        System.out.println("HEX: ");
        System.out.println("a : "+ showIntAsHex(a));
        System.out.println("b : "+ showIntAsHex(b));
        System.out.println("a + b : "+ showIntAsHex(dodawana));

    }
    public static void odejmij ( int a, int b){

        System.out.println("--- ODEJMOWANIE ---");
        int dodawana= a-b;
        System.out.println("różnica " + a + " - "+ b + " równa jest : "+ dodawana);
        System.out.println("BIN: ");
        System.out.println("a : "+ showIntAsBINary(a));
        System.out.println("b : "+ showIntAsBINary(b));
        System.out.println("a - b : "+ showIntAsBINary(dodawana));
        System.out.println("OCT : ");
        System.out.println("a : "+ showIntAsOctal(a));
        System.out.println("b : "+ showIntAsOctal(b));
        System.out.println("a - b : "+ showIntAsOctal(dodawana));
        System.out.println("HEX: ");
        System.out.println("a : "+ showIntAsHex(a));
        System.out.println("b : "+ showIntAsHex(b));
        System.out.println("a - b : "+ showIntAsHex(dodawana));

    }
    public static void pomnoz( int a, int b){

        System.out.println("*** MNOŻENIE ***");
        int dodawana= a*b;
        System.out.println("iloczyn" + a + " * "+ b + " równa jest : "+ dodawana);
        System.out.println("BIN: ");
        System.out.println("a : "+ showIntAsBINary(a));
        System.out.println("b : "+ showIntAsBINary(b));
        System.out.println("a * b : "+ showIntAsBINary(dodawana));
        System.out.println("OCT : ");
        System.out.println("a : "+ showIntAsOctal(a));
        System.out.println("b : "+ showIntAsOctal(b));
        System.out.println("a * b : "+ showIntAsOctal(dodawana));
        System.out.println("HEX: ");
        System.out.println("a : "+ showIntAsHex(a));
        System.out.println("b : "+ showIntAsHex(b));
        System.out.println("a * b : "+ showIntAsHex(dodawana));

    }public static void podziel( int a, int b){

        System.out.println("::: DZIELENIE :::");
        int dodawana= a/b;
        System.out.println("iloraz " + a + " \\ "+ b + " równa jest : "+ dodawana);
        System.out.println("BIN: ");
        System.out.println("a : "+ showIntAsBINary(a));
        System.out.println("b : "+ showIntAsBINary(b));
        System.out.printf("a \\ b : "+showIntAsBINary(dodawana));
        System.out.println("OCT : ");
        System.out.println("a : "+ showIntAsOctal(a));
        System.out.println("b : "+ showIntAsOctal(b));
        System.out.println("a \\ b : "+ showIntAsOctal(dodawana));
        System.out.println("HEX: ");
        System.out.println("a : "+ showIntAsHex(a));
        System.out.println("b : "+ showIntAsHex(b));
        System.out.println("a \\ b : "+ showIntAsHex(dodawana));

    }

    public static String showIntAsBINary(int i) {
        return "" + Integer.toBinaryString(i);
    }

    public static String showIntAsOctal(int i) {
        return "" + Integer.toOctalString(i);
    }

    public static String showIntAsHex(int i) {
        return "" + Integer.toHexString(i);
    }


}
