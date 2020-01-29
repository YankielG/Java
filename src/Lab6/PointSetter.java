package Lab6;

import java.awt.*;
import java.sql.SQLOutput;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(4,13);
        Point point;

        System.out.println("Położenie pączątkowe:" );
        System.out.println("x=" + location.x);
        System.out.println("x=" + location.y);

        System.out.println("przejscie do punktu 7,8");
        location.x = 7;
        location.y = 6;

        point = location;
        point.x = 0;
        point.y = 0;

        System.out.println("Położenie pączątkowe:" );
        System.out.println("x=" + location.x);
        System.out.println("x=" + location.y);



    }



}
