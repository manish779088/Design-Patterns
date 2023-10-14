package BehavioralDesignPattern.StrategyPattern.With;

import BehavioralDesignPattern.StrategyPattern.With.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
