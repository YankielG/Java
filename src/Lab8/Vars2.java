package Lab8;

public class Vars2 {
    int i; //zmienna egzeplarza pole klasy
    static  int j = 2; // zmienna statyczne

    public int change () {
        int k =7;
        return i + (k+j);
    }

    public static void main(String[] args) {
        int i = 77;
        Vars2 v = new Vars2();
        v.i = 9;
        System.out.println("wyswitlamy zmiena ekgzemplarz v:" + v.i);
        Vars2 vv = new Vars2();
        vv.i=5;
        System.out.println("zmiena ezgemplarza " + vv.i);
        System.out.println(" zmienna statycza " + j);
        System.out.println("wystlana zmine lokalna " + i);
    }

    void show() {
        System.out.println("-------------------");

    }
    int g=6;
}
