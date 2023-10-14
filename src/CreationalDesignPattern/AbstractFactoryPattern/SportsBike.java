package CreationalDesignPattern.AbstractFactoryPattern;

public class SportsBike extends Bike{

    @Override
    public void setVehicleType() {
        bikeType="Sports";
    }

    @Override
    public void setBaseCost() {
        baseCost=40;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargePerUnitDistance=15;
    }
}
