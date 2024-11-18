package Toppings;

import BasePizza.BasePizzzzzzaaaaa;

public class ExtraCheese extends ToppingDecorator{
    BasePizzzzzzaaaaa basePiza;
    public ExtraCheese(BasePizzzzzzaaaaa basePiza){
        this.basePiza=basePiza;
    }

    @Override
    public int cost() {

        return this.basePiza.cost() + 10;
    }
}
