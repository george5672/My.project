package HW12;

public class Car {
    public static void main(String[] args) {

    }
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity system started");
    }

    private void startCommand() {
        System.out.println("Command system started");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started");
    }
}