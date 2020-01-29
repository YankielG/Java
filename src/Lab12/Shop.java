package Lab12;

public class Shop {
    public static void main(String[] args) {
        Product mikl1 = new Product("Mleko1", 2.78);
        Product mikl2 = new Product("Mleko2", 2.78);

        System.out.println(mikl1==mikl2); //false
        System.out.println(mikl1.equals(mikl2)); //false



    }
}
