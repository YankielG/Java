package Cwiczenie9;

import java.awt.*;

public class FourDpoint extends Point{
    int z;
    int t;


    public static FourDpoint create(int x, int y, int z, int t)
    {
        FourDpoint fourDpointtt = new FourDpoint();
        fourDpointtt.x =x;
        fourDpointtt.y =y;
        fourDpointtt.z =z;
        fourDpointtt.t =t;
        return fourDpointtt;

    }
    public void show()
    {
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(this.z);
        System.out.println(this.t);
    }

    public static void main(String[] args) {

        FourDpoint p;
        p = create(1,5,10,15);
        p.show();


    }}