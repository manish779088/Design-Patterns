package BehavioralDesignPattern.StrategyPattern.With;

import BehavioralDesignPattern.StrategyPattern.With.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    // this is known to be constructor injection
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
