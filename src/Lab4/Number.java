package Lab4;

public class Number {



    public static void main(String[] args) {

        String First_name;
        String Last_name;
        int Age;
        char Gander;
        int Personal_ID_Number;



        First_name("Grzes");
        Last_name("Jankowicz");
        Age(90);
        Gander('M');
        Personal_ID_number(54845548);



    }

    public static void First_name(String c) {

        System.out.println("Imię: " + c + ".");
    }


    public static void Last_name(String c) {

        System.out.println("Nazwisko: " + c + ".");

    }

    public static void Age(int c) {

        System.out.println("Wiek: " + c + ".");
    }

    public static void Gander(char c) {

        System.out.println("Płeć: " + c + ".");
    }

    public static void Personal_ID_number(int c) {

        System.out.println("ID: " + c + ".");
    }

}