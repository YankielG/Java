package DebuggerDemo;

import java.util.Random;

public class DebuggerDemo {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        fill(numbers);
        show(numbers);
    }
    static  void fill (int [] numbers){

        Random random = new Random();
        for (int i=0; i < numbers.length; i++){
            numbers[i] = random.nextInt(10);

        }


    }
    static void show(int[] numbers){
        for (int number : numbers){
            System.out.println(number+" ");
        }



    }

}
