package Toppings;

import BasePizza.BasePizzzzzzaaaaa;

public class Mushroom extends ToppingDecorator{
    BasePizzzzzzaaaaa basePiza;
    public Mushroom(BasePizzzzzzaaaaa basePiza){
        this.basePiza=basePiza;
    }

    @Override
    public int cost() {

        return this.basePiza.cost() + 20;
    }
}
