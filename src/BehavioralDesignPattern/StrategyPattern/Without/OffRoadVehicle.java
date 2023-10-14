package BehavioralDesignPattern.StrategyPattern.Without;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive() {
        System.out.println("special capability");
    }
}
