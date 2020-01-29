package Lab15.pl.edu.wszib.jwe;

public class LettersApp {
    public static void main(String[] args) {

        A a = new A();
        a.introduce();

        B b = new B();
        b.introduce();

        Letter ca = new A();
        ca.introduce();

        Letter cb = new B();
        cb.introduce();


A aaa = new B();
aaa.introduce();
    }



}

interface Letter {
    void introduce();

}

class A implements Letter{
    @Override
    public void introduce() {
        System.out.println("jestem A");
    }
}

class B extends A implements Letter {
    @Override
    public void introduce() {
        System.out.println("jestem b");
    }
}