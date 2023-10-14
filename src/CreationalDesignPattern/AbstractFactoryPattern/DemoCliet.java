package CreationalDesignPattern.AbstractFactoryPattern;

public class DemoCliet {
    public static void main(String[] args) {
        int distance =10;
        AbstractVehicleFactory carfactory = FactoryProvider.getVehicleFactory("Car");
        Vehicle minicar = carfactory.getVehicle("Mini");
        minicar.book(distance);
    }
}
