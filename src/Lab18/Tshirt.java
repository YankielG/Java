package Lab18;

public class Tshirt {
    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Polex");
        Tshirt tshirt2 = new Tshirt(TshirtSize.S, "polesssx");
        Tshirt tshirt3 = new Tshirt(TshirtSize.XL, "polexsfd");


        System.out.println(tshirt.size);
        System.out.println(tshirt.size.getChestWidth());
        System.out.println(tshirt.getTsirtSizeDetails());
        System.out.println(tshirt2.getTsirtSizeDetails());
        System.out.println(tshirt3.getTsirtSizeDetails());


    }

    public String getTsirtSizeDetails(){
        return size + "("+size.getChestWidth()+","+ size.getShirtLength() + size.getSleeveLength()+")";
    }



}