package BehavioralDesignPattern.StrategyPattern.With;

import BehavioralDesignPattern.StrategyPattern.With.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

   OffRoadVehicle(){
       super(new SpecialDriveStrategy());
   }
}
