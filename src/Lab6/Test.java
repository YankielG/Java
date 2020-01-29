package Lab6;

public class Test {

    public static void main(String[] args) {

        int accoutBalance = 15005;
        System.out.println(accoutBalance);

        System.out.printf("Saldo: %,d zł%n", accoutBalance);

        // s - string
        // d - liczby całkowite
        // f - zmienn przecinkowe
        // t - data
        // n -separator lin
        // bB - boolean

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.3f%n",pi);


        byte a = 7;
        short b;
        int c;

        c = a; //niejawna konwersja
        b = (short) c; //rzutowanie

        Employee employee = new Employee();
        VicePresident vp = new VicePresident();

        employee = vp;

        Float f1 = 12.5f;
        Float f2 = 27.2f;

        System.out.println(Math.min(f1,f2));


        String str = "Yankiel";
        System.out.println(str.getClass().getName());

        boolean check = str instanceof String;
        System.out.println(check);




    }
}

class Employee {}
class VicePresident extends Employee {}