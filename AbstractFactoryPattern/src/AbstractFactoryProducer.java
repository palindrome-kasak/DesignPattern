public class AbstractFactoryProducer {
 public AbstractFactory getFactory(String value){
     if(value.equals("Economy")){
         return new EconomicCar();
     } else if (value.equals("Luxary")) {
         return new LuxaryCar();
     }
     return null;
 }
}
