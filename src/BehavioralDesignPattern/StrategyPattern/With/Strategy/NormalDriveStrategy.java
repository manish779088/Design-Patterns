package BehavioralDesignPattern.StrategyPattern.With.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal capability");
    }
}
