package Lab;

public class Test {
    public static void main(String[] args) {

        int x=5;
        x=x=2;
        System.out.println(x);


            int w,y,z;
            w=42;
            y=x++;
        System.out.println(w);
        System.out.println(y);

        System.out.println(String.format("%8s", Integer.toBinaryString(w)).replace (' ','0'));
    }
}
