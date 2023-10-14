package StructuralDesignPattern.DecoratorPattern.ToppingDecorator;

import StructuralDesignPattern.DecoratorPattern.BasePizza.BasePizza;

public class ExtraVeggie extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraVeggie(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }

}
