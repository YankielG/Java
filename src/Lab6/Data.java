package Lab6;

import java.awt.*;
import java.util.StringTokenizer;

public class Data {
    public static void main(String[] args) {

        String str = "29/04/2016";
        System.out.println("Dzień: " + str.substring(0,2));
        System.out.println("Mesiąc: " + str.substring(3,5));
        System.out.println("Rok: " + str.substring(6,10));


        StringTokenizer data2 = new StringTokenizer(str, "/");
        System.out.println("dzien " + data2.nextToken());
        System.out.println("dzien " + data2.nextToken());
        System.out.println("dzien " + data2.nextToken());


    }
}
