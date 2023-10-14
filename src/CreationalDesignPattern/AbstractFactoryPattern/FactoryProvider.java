package CreationalDesignPattern.AbstractFactoryPattern;

public class FactoryProvider {

    public static AbstractVehicleFactory getVehicleFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Car")){
            return new CarFactory();
        }
        else {
            return new BikeFactory();
        }

    }
}
