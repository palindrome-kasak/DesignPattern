public class Main {
    public static void main(String[] args) {

        System.out.println("Factory Pattern");
        AbstractFactoryProducer abstractFactoryProducerOb = new AbstractFactoryProducer();
        AbstractFactory abstractFactoryObj = abstractFactoryProducerOb.getFactory("Economy");
        Car carObj = abstractFactoryObj.getInstance(300000);
        int value= carObj.getTopSpeed();
        System.out.println("value is " + value);

    }
}