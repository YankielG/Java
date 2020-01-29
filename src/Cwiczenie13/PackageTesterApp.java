package Cwiczenie13;

public class PackageTesterApp {
    public static void main(String[] args) {
        Cwiczenie13.pack1.PackageTester pack1 = new Cwiczenie13.pack1.PackageTester();
        Cwiczenie13.pack2.PackageTester pack2 = new Cwiczenie13.pack2.PackageTester();
        Cwiczenie13.pack3.PackageTester pack3 = new Cwiczenie13.pack3.PackageTester();

        pack1.introduce();
        pack2.introduce();
        pack3.introduce();

    }
}
