package Domowe_1;

public class Cat extends Animal {
    public Cat(){};

    public Cat(String animal) {
        super(animal);
    }

    @Override
    public void animalVoice(String animal) {

        System.out.println(animal + " Misiek ");
    }

}
