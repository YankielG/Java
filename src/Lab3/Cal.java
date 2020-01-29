package Lab3;

public class Cal {

    public static void main(String[] args) {
        obwod(2);
        przekatna(2);
        kwadrat(2);

        obwod(7);
        przekatna(7);
        kwadrat(7);

        obwod(11);
        przekatna(11);
        kwadrat(11);

        obwod(19);
        przekatna(19);
        kwadrat(19);
    }



    public static void obwod(double a){

        System.out.println("Obwód kwadratu:" + (4*a));
    }


    public static void przekatna (double a){


        System.out.println("Przekątna: "+(Math.sqrt(2)*a));
    }


    public static void kwadrat(double a){

        System.out.println("Pole kwadratu : " + (a*a));
        }
}
