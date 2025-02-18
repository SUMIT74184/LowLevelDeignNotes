package observerPattern.Observer;

import observerPattern.Observable.StockObservable;

public class MobileObserverAlertImpl implements NotificationAlertObserver{
        //same as the email observerIml
    String emailId;
    StockObservable observable;

     public MobileObserverAlertImpl(String emailId, StockObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
    SendEmail("message sent to"+emailId,"lets go");
    }

    private void SendEmail(String emailId,String msg){
        System.out.println("message sent to email"+emailId+msg);
    }
}
