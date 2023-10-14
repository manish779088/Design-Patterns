package BehavioralDesignPattern.ObserverPattern.Observable;

import BehavioralDesignPattern.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    List<NotificationAlertObserver> list = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        list.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        list.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver notificationAlertObserver:list){
            notificationAlertObserver.update();
        }
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount==0){
            notifySubscriber();
        }
        stockCount=stockCount+newStockCount;
    }
}
