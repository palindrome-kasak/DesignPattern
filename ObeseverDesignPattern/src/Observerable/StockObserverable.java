package Observerable;

import Observer.NotificationAlertObserver;

public interface StockObserverable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void nofifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();

}
