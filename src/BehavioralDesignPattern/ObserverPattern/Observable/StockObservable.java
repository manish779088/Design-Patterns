package BehavioralDesignPattern.ObserverPattern.Observable;

import BehavioralDesignPattern.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscriber();
    public void setStockCount(int newStockCount);
    public int getStockCount();

}
