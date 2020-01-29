package Lab12;

public class Employ {
    String name;
    int age;
    int slary;

    public Employ(String name, int age, int slary) {
        this.name = name;
        this.age = age;
        this.slary = slary;


    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", slary=" + slary +
                '}';
    }
}
