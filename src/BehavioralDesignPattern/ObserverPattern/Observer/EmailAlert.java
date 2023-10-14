package BehavioralDesignPattern.ObserverPattern.Observer;

import BehavioralDesignPattern.ObserverPattern.Observable.StockObservable;

public class EmailAlert implements NotificationAlertObserver{
       String emailId;
       StockObservable observable;
    public EmailAlert(String emailId, StockObservable observable){
        this.emailId =emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
        System.out.println(observable.getStockCount() +" this is stock count now");
        sendmail();
    }
    private void sendmail(){
        System.out.println("Hurry up phone in stock" + emailId);
    }
}
