package Observer;

import Observerable.StockObserverable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObserverable observerable;

    public MobileAlertObserverImpl(String userName,StockObserverable observerable){
        this.userName=userName;
        this.observerable=observerable;
    }
    @Override
    public void update() {
        sendMsg(userName,"product is in stock now");
    }

    private void sendMsg(String userName, String msg) {
        System.out.println("msg sent to :" + userName);
    }
}
