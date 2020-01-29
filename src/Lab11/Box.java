package Lab11;

import java.awt.*;

public class Box {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }
    Box(Point topLeft, Point bootmoRight){
        this(topLeft.x,topLeft.y,bootmoRight.x,bootmoRight.y);
    }
    Box(Point topLeft,int w, int h)
    {
        this(topLeft.x,topLeft.y,topLeft.x+w,topLeft.y+h);
    }

    void printBox() {
        System.out.println("BOX: < " + x1 + "," + y1 + "," + x2 + "," + y2 + " >");
    }

    public static void main(String[] args) {
        System.out.println(" Tworzenie Box ze współrzędnymi (25, 25,) i (50,50)");
        Box box;
        box = new Box(25,25,50,50);
        box.printBox();

        System.out.println("Tworzenie Box z punktami (10,10) i(20, 20)");
        box = new Box(new Point(10,10),new Point(20,20));
        box.printBox();

        System.out.println("Tworzenie Box z punktami (2,5) z szerokością 30 i wysokością 34 ");
        box= new Box(new Point(2,5),30,40);
        box.printBox();

    }
}
