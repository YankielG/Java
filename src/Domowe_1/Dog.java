package Domowe_1;


public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String animal) {
        super(animal);
    }

    @Override
    public void animalVoice(String animal) {

        System.out.println(animal + " Kłapciok");
    }


}