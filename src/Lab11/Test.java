package Lab11;

public class Test {
    public static void main(String[] args) {
        //B b = new B();
        //b.show();

        //A a = new A();
        // a.show();
        A a = new A();
        A a2 = new A("test");
        B b = new B("testowy");
    }
}
class A {
    A() {
        System.out.println("Działa konstruktor A()");
    }
    A(String param) {
        System.out.println("Działa konstruktor A() z parametrem " + param );
    }
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("Działa konstruktor B()");
    }

    B(String param) {
        System.out.println("Działa konstruktor B() z parametrem " + param);
    }
    void  show() {
        System.out.println("B");
    }
}

