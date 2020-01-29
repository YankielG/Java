package Lab6;

import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {

        StringTokenizer st1, st2;
        String quote1 = "GooG 530, 80 -9398";
        st1= new StringTokenizer(quote1);
        System.out.println("Token1 " + st1.nextToken()) ;
        System.out.println("Token2 " + st1.nextToken()) ;
        System.out.println("Token3 " + st1.nextToken()) ;

        String quote2 =  "RHT@75,00@0,22";
        st2 =  new StringTokenizer(quote2, "@");

        System.out.println("\nToken1 " + st2.nextToken()) ;
        System.out.println("Token2 " + st2.nextToken()) ;
        System.out.println("Token3 " + st2.nextToken()) ;





    }







}
