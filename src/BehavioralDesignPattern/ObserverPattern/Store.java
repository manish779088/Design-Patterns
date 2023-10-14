package BehavioralDesignPattern.ObserverPattern;

import BehavioralDesignPattern.ObserverPattern.Observable.IphoneObservableImpl;
import BehavioralDesignPattern.ObserverPattern.Observable.StockObservable;
import BehavioralDesignPattern.ObserverPattern.Observer.EmailAlert;
import BehavioralDesignPattern.ObserverPattern.Observer.NotificationAlertObserver;
import BehavioralDesignPattern.ObserverPattern.Observer.SmsAlert;

public class Store {
    public static void main(String[] args) {
        StockObservable iphone = new IphoneObservableImpl();
        NotificationAlertObserver email = new EmailAlert("mm779088",iphone);
        NotificationAlertObserver sms = new SmsAlert("9923",iphone);
        iphone.add(email);
        iphone.add(sms);
        iphone.setStockCount(10);
    }
}
