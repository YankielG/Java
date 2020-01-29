package Domowe_1;

public class Animal implements Voice {

    String animal =  new String();

    public Animal(){};
    public Animal(String animal) {
        this.animal = animal;
        this.animalVoice(animal);

    }

    public void animalVoice(String animal) {

        System.out.println(animal+"Kota i Psa.");


    }


}
