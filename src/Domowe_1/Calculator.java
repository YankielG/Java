package Domowe_1;

public class Calculator {

    public static void main(String[] args) {

        int a=5;
        int b=7;
        int c=0;

        System.out.println("Dodawanie: "      + a + "+" + b + "=" + addition(a, b, c));
        System.out.println("Odejmijmowanie: " + a + "-" + b + "=" + substract(a,b));
        System.out.println("Mnożenie: "       + a + "*" + b + "=" + multiplication(a,b));


    }


    public static int addition(int a, int b, int c)
    {
        c=a+b;
        return c;
    }
    public static int substract(int a, int b)
    {
        return a-b;

    }
    public static int multiplication(int a, int b)
    {
        return a*b;
    }

}
