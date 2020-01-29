package Lab14;


public class WashingMachine {

    private int temperature;
    private int spining;

    void modeForSensitiveClothes() {
        temperature = 30;
        spining = 800;
    }

    void modeForTowelsAndBedLinen() {
        temperature = 90;
        spining = 1200;
    }

    public void showSettings(){
        System.out.println("temperataura  ;" + this.temperature + "obroty:" + this.spining);
    }

    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.modeForSensitiveClothes();
        washingMachine.showSettings();

    }
}