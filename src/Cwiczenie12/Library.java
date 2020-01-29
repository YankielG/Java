package Cwiczenie12;

public class Library {
  static   Book [] tablica = new Book[]{
          new Book("a1","a2","a3",11),
          new Book("b1","b2","b3",11) ,
          new Book("c1","b2","b3",11),
          new Book("a1","a2","a3",11)
    };

    public static void main(String[] args) {
        System.out.println(tablica[1].equals(tablica[2]));
        System.out.println(tablica[2].equals(tablica[2]));
        System.out.println(tablica[3].equals(tablica[2]));
        System.out.println(tablica[1].equals(tablica[2]));
    }
}
