package CreationalDesignPattern.AbstractFactoryPattern;

public class BikeFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equals("Sports")){
            return new SportsBike();
        }
        else {
            return new NormalBike();
        }
    }
}
