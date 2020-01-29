package Lab9;

import java.awt.*;

public class Passing {

    public static void main(String[] args) {
        int i = 10;
        System.out.println("przed " + i);
        changeIt(i);
        System.out.println("po zminaie " + i);

        Point p = new Point(1,1);
        System.out.println("przed " + p);
   changeIt(p);
        System.out.println("po " + p);

    }






    static  void  changeIt (int i){
        System.out.println("zmienia sie ");
    i++;
        System.out.println(i);
    }
static void changeIt (Point p) {
        p = new Point(4,4);
    System.out.println("zmienia sie");
        p.x++;
        p.y++;
}


}



