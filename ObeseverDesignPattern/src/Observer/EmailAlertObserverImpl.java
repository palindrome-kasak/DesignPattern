package Observer;

import Observerable.StockObserverable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObserverable observerable;

    public EmailAlertObserverImpl(String emailId,StockObserverable observerable){
        this.emailId=emailId;
        this.observerable=observerable;
    }
    @Override
    public void update() {
        sendMail(emailId,"product is in stock now");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("main sent to :" + emailId);
    }
}
