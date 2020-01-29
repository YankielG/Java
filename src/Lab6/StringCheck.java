package Lab6;

public class StringCheck {

    public static void main(String[] args) {

        String str = "Lannister zawsze spłaca swoje długi";
        System.out.println("nassz tekst " + str);
        System.out.println("Dlugoc teksstu " + str.length());
        System.out.println("znak na poz 6 " + str.charAt(6));
        System.out.println("fragment 10 do 16 " + str.substring(10,16));
        System.out.println("index 1lit " + str.indexOf('t'));
        System.out.println("indeks poczatku długi " + str.indexOf("długi"));
        System.out.println("Tex zapisany wielkim literami " + str.toUpperCase());





    }

}
