import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;
import Observerable.IphoneObservable;
import Observerable.StockObserverable;
import com.sun.security.auth.NTDomainPrincipal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StockObserverable iphoneStockObersable = new IphoneObservable();


        NotificationAlertObserver ob1= new EmailAlertObserverImpl("kasak@gmail.com", iphoneStockObersable);
        NotificationAlertObserver ob2= new EmailAlertObserverImpl("gupta@gmail.com", iphoneStockObersable);
        NotificationAlertObserver ob3= new MobileAlertObserverImpl("kasakGupta", iphoneStockObersable);

        iphoneStockObersable.add(ob1);
        iphoneStockObersable.add(ob2);
        iphoneStockObersable.add(ob3);

        iphoneStockObersable.setStockCount((10));
        System.out.println("end world!");
    }
}