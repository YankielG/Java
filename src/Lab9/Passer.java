package Lab9;

public class Passer {
    void toUpperCase(String [] strings) {
        for (int i=0; i < strings.length; i++){
            strings[i] = strings[i].toUpperCase();

        }

    }

    public static void main(String[] argsuments) {
        Passer passer = new Passer();
        passer.toUpperCase(argsuments);
        for (String  string: argsuments) {
            System.out.println(string + " ");
        }
        System.out.println();
    }



}
