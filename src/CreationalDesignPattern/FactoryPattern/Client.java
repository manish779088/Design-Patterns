package CreationalDesignPattern.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        MilkShakeFactory milkShakeFactory = new MilkShakeFactory();

        MilkShake Oreomilk = milkShakeFactory.prepare(MilkshakeName.OreoMilkshake);
        MilkShake ButterScoth =  milkShakeFactory.prepare(MilkshakeName.Butterscotchshake);
        MilkShake Vennila = milkShakeFactory.prepare(MilkshakeName.Vennilashake);


    }
}
