package CreationalDesignPattern.FactoryPattern;

public class OreoMilkshake implements MilkShake{
    public final String name;

    public OreoMilkshake(){
        this.name=MilkshakeName.OreoMilkshake.toString();
    }

}
