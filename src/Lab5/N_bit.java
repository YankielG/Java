package Lab5;

public class N_bit {

    public static void main(String[] args) {


        int  x = 11;       // liczba binarna
        int y = 3;         // miejsce do sprawdzenia
        int maska =1;
        int sprawdzenie = maska << y;

        String z = String.format("%32s", Integer.toBinaryString(x)).replace (' ','0');
        System.out.println("liczba " + z + " na miescu " + y + " ma:");
        char v =  z.charAt(31-y);
        System.out.println(v);

        boolean p = (x & sprawdzenie) > 0;

        System.out.println("na miescu " + y + " liczby " + x + " znajduje sie " + p );

    }

}
