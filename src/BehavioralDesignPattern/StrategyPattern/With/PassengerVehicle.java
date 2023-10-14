package BehavioralDesignPattern.StrategyPattern.With;

import BehavioralDesignPattern.StrategyPattern.With.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
