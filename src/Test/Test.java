package Test;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        A a = new A();
        a.show();



    }
}
class A{
    void show(){
        System.out.println("A");
    }
}

class B extends A{
    void show(){
        System.out.println("B");
    }

}
