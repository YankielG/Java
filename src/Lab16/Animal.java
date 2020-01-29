package Lab16;

public class Animal {
    String name;

    public Animal (String name) {
        this.name = "bezimienny";
    }

    String showName (){
        return "zwierzę" + name;

    }

    String makeSound(){
        return "????";
    }

    void introduce () {
        System.out.println("Jestem" + showName()+ " : "+ makeSound());
    }


}
