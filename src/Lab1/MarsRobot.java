package Lab1;

import Lab2.Ala;

public class MarsRobot implements Ala {
    String status;
    int speed;
    float temperature;

    public void cheackTemperature() {

        if (temperature < -80) {
            status = "powrot do domu";
            speed = 5;
        }

    }
   public void checkStatus()
    {
        System.out.println("status: " + status);
    }


    void showAttributes() {
        System.out.println("status:" + status);
        System.out.println("predkosc:" + speed);
        System.out.println("temperataura:" +temperature);

    }


}
