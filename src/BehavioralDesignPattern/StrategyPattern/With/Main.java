package BehavioralDesignPattern.StrategyPattern.With;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new SportsVehicle();
        v1.drive();

        Vehicle v2 = new GoodsVehicle();
        v2.drive();
    }
}
