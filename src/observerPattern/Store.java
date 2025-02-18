package observerPattern;

import observerPattern.Observable.IphoneObservableImp;
import observerPattern.Observable.StockObservable;
import observerPattern.Observer.EmailObserverAlertImpl;
import observerPattern.Observer.MobileObserverAlertImpl;
import observerPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable Iphone=new IphoneObservableImp();

        //we are adding  observer inside the observable
        NotificationAlertObserver obs1=new EmailObserverAlertImpl("xyz@gmail.com",Iphone);
        NotificationAlertObserver obs2=new MobileObserverAlertImpl("nap@admin.com",Iphone);
        NotificationAlertObserver obs3=new EmailObserverAlertImpl("abc@gmail.com",Iphone);

        Iphone.add(obs1);
        Iphone.add(obs2);
        Iphone.add(obs3);

        Iphone.setStockCount(34);
        int and=Iphone.getStockCount();
        System.out.println("total number of product available is "+ and);

    }
}
