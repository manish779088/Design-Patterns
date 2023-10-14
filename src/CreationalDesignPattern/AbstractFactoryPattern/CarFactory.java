package CreationalDesignPattern.AbstractFactoryPattern;

public class CarFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equals("Mini")){
            return new MiniCar();
        }
        else if(type.equals("Mega")){
            return new MegaCar();
        }
        else {
            return new MiniCar();
        }
    }
}
