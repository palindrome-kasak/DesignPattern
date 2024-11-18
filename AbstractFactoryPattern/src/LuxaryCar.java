public class LuxaryCar implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price>=100000){
            return new LuxaryCar1();
        }
        else{
            return new LuxaryCar2();
        }
    }
}
