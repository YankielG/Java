package Cwiczenie10;

public class Calculator {

    int add(int a,int b){
    return a+b;
    }
    int add(int a,int b,int c) {
     return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }
    double add(double a,double b,double c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res1 = calc.add(1, 2);
        double res2 = calc.add(1.0, 2.4, 3.4);
        System.out.println(res1);
        System.out.println(res2);

    }
}
