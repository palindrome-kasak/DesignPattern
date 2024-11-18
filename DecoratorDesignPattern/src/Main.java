import BasePizza.BasePizzzzzzaaaaa;
import BasePizza.Margherita;
import Toppings.ExtraCheese;
import Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {

        System.out.println("i need margherieta + extra chese + mushroom");
        BasePizzzzzzaaaaa basePiz = new Mushroom(new ExtraCheese(new Margherita()));
        int costofPizz = basePiz.cost();

        System.out.println("cost of margherieta + extra chese + mushroom "+costofPizz);
    }
}