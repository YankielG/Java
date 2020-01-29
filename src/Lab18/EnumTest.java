package Lab18;

public class EnumTest {

    public static void main(String[] args) {

        System.out.println(Types.one);
        System.out.println(Types.valueOf("two"));
        System.out.println(Types.three.name());

        for (Types types : Types.values()) {
            System.out.println(types.ordinal() + "-" + types);
        }

    }

};