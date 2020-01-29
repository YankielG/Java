package Lab11;

public class MarsRobot {
    String status;
    int speed;
    int power;

    MarsRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot("exploracja", 3, 20);
        System.out.println(marsRobot.power);

    }
}
