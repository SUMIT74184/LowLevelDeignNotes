package observerPattern.Observer;

import observerPattern.Observable.StockObservable;

public class EmailObserverAlertImpl implements NotificationAlertObserver {
    String emailId;
    StockObservable observable;

    public EmailObserverAlertImpl(String emailId,StockObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
        SendEmail(emailId,"product is available now please explore it ....hurry up!!!!!"+"ad");
    }
    public void SendEmail(String emailId,String msg){
        System.out.println("mail sent to "+ emailId+msg);
    }
}
