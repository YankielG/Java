package Lab7;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        System.out.println("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n++;

        int w =  n;
        int b= 1;

        if (n < 30) {
            for (int i = 1; i < n; i++) {
                for (int a = b; a < w; a++) {

                    System.out.print(a + " ");
                }
                System.out.println();
                b++;
                w++;


            }
        }
            if (n>30){
                n--;
             System.out.println("Liczba " + n + " poz zakresu !");
           }

        }
    }

