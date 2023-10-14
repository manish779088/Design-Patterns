package CreationalDesignPattern.FactoryPattern;

import java.util.HashMap;

public class MilkShakeFactory {

    private HashMap<MilkshakeName,MilkShake> milkshakeMenu;

    public MilkShakeFactory(){
        buildMilkshakeMenu();
    }

    public MilkShake prepare(MilkshakeName milkshakeName){
        if(milkshakeName == null){
            System.out.println("Please provide milkshake Name");
            return null;
        }

        System.out.println(milkshakeName + "ready!");
        return milkshakeMenu.get(milkshakeName);
    }

    private void buildMilkshakeMenu(){
        milkshakeMenu = new HashMap<MilkshakeName, MilkShake>();

        milkshakeMenu.put(MilkshakeName.OreoMilkshake, new OreoMilkshake());
        milkshakeMenu.put(MilkshakeName.Butterscotchshake, new Butterscothshake());
        milkshakeMenu.put(MilkshakeName.Vennilashake, new Vennilashake());
    }

}
