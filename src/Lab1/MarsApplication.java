package Lab1;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        MarsRobot spirit1 = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed =2;
        spirit.temperature = -60;
        spirit.showAttributes();
        System.out.println("zwiekszenie predkosci do 3");
        spirit.showAttributes();

        System.out.println("zmina temperatury na -90");
        spirit.showAttributes();
        System.out.println("sprawdznie temperatury");
        spirit.cheackTemperature();
        spirit.showAttributes();


        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "test";
        opportunity.speed =5;
        opportunity.temperature=45;
        opportunity.checkStatus();


    }
}
