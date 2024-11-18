public class EconomicCar implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
       if(price>300000 && price<100000){
            return new EconomicCar2();
        }
       else{
           return new EconomicCar1();
       }
    }
}
