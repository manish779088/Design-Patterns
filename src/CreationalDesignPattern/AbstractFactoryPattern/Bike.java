package CreationalDesignPattern.AbstractFactoryPattern;

public abstract class Bike implements Vehicle {
    String bikeType;
    int baseCost;
    int chargePerUnitDistance;

    @Override
    public void book(int distance) {
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a "+bikeType+"Bike for a distance"+distance+"kms a total cost of "+cost+".");
    }

    @Override
    public int calculateCostOfBooking(int distance) {
        return baseCost+chargePerUnitDistance*distance;
    }
}
