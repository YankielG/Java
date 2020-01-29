package Cwiczenie11;

public class Cwiczenie11 {

    public static void main(String[] args) {
    new C();
    }



}
class A{
    A(){
        System.out.println(" A");
    }
    A(boolean akcja){
        if( akcja == false){
            System.out.println("Wywołano konstruktor A");
        }
    }
}
class B extends A{
    B(){

        System.out.println(" B");
    }

    B(boolean akcja){
        super(true);
        if( akcja == false){
            System.out.println("Wywołano konstruktor B");
        }
    }
}
class C extends B{
    C(){

        System.out.println(" C");

    }
    C(boolean akcja){
        super(true);
        if( akcja == false){
            System.out.println("Wywołano konstruktor C");
        }
    }
}
