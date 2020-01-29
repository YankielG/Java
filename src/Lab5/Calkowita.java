package Lab5;

public class Calkowita {

    public static void main(String[] args) {

        int a = 12;          // dzielna
        int b = 5;          // 1 dzielna
        int c = 3;          // 2 dzielna

        System.out.println("Liczba " + a +  " podzielna przez " + b + " i " + c + " ?");
        System.out.println( ((a % b) == 0 && (a % c) == 0) );


    }



}
