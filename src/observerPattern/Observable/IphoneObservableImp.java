package observerPattern.Observable;

import observerPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImp implements StockObservable {
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    int StockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        //iterating everyone in the list
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(StockCount==0){
            notifySubscribers();
        }
        StockCount+=newStockAdded;//adding the new Stock now the product is available
//        notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return StockCount;
    }
}
