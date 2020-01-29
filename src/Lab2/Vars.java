package Lab2;

import java.text.DecimalFormat;

public class Vars {
    public static void main(String[] args) {
        int number = 124_567;

       double a = 3e-10;
       double b = 3e+100;
        DecimalFormat df = new DecimalFormat("#.###########################");
        System.out.println(df.format(a));
        System.out.println(df.format(a));



    }

}
