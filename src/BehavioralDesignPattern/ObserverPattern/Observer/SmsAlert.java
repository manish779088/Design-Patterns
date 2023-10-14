package BehavioralDesignPattern.ObserverPattern.Observer;

import BehavioralDesignPattern.ObserverPattern.Observable.StockObservable;

public class SmsAlert implements NotificationAlertObserver{

    String contact;
    StockObservable stockObservable;
    public SmsAlert(String contact,StockObservable stockObservable){
        this.contact=contact;
        this.stockObservable=stockObservable;
    }

    @Override
    public void update() {
        System.out.println(" Hurry up now stock count" +stockObservable.getStockCount());
        sendsms();
    }

    public void sendsms(){
        System.out.println("SMS sent to"+contact);
    }
}
