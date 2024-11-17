package Observerable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObserverable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stocckCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void nofifySubscribers() {
        for( NotificationAlertObserver ob : observerList) {
            ob.update();
        }
    }
        public void setStockCount(int newStockAdded) {
        if(stocckCount==0){
            nofifySubscribers();
        }
        stocckCount=stocckCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stocckCount;
    }

}


