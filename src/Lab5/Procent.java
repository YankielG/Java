package Lab5;

public class Procent {

    public static void main(String[] args) {

        int a = 14_000;     //inwestycja
        int b = 40;         //porcent zysku po 1 roku
        int c = 1500;         // strata po 2 roku
        int d = 12;          // zysk po 3 roku

        System.out.println("Wartość inwestycji: " + a + "zł." );
        a=a+(a*b)/100;
        System.out.println("Wartość inwestycj po 1 poku: " + a + "zł" );
        a=a-c;
        System.out.println("Wartość inwestycj po 2 poku: "+ a + "zł" );
        a=a+((a*d)/100);
        System.out.println("Wartość inwestycj po 3 poku: "+ a + "zł" );
    }

}
