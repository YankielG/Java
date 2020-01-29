package Lab7;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        long e = 0;

        String str = "10101";
        int b = str.length();

        for (int a=0; a<b; a++){

            char f = str.charAt(a);
            e += Character.getNumericValue(f); // do poprwy

            System.out.println("Liczba " + e);
        }



    }


}
