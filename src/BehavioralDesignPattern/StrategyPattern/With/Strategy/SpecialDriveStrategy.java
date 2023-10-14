package BehavioralDesignPattern.StrategyPattern.With.Strategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special capability");
    }
}
