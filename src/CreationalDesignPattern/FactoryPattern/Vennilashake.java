package CreationalDesignPattern.FactoryPattern;

public class Vennilashake implements MilkShake{
    public final String name;

    public Vennilashake(){
        this.name = MilkshakeName.Vennilashake.toString();
    }
}
