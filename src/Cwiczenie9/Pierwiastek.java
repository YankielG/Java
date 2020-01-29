package Cwiczenie9;

public class Pierwiastek {
    void sqrt(Double a)
    {
        System.out.println( Math.sqrt(a));
    }

    public static void main(String[] args) {
        Pierwiastek pierwiastek = new Pierwiastek();
        for (int i=0;i<args.length;i++)
        {
            System.out.print(" pierwiastek z " + args[i] + " = ");
            pierwiastek.sqrt(Double.parseDouble(args[i]));
        }

    }
}



