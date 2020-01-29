package Lab16;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    String showName() {
        return "pies" + name;
    }


    @Override
    String makeSound() {
        return "hau";
    }
}
