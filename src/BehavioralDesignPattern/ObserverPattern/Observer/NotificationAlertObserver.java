package BehavioralDesignPattern.ObserverPattern.Observer;

public interface NotificationAlertObserver {
    //here in update method we need observable object but in which observable change happend that we dont know
    // so for that update method need observable object to make some on that
    // but obesrvable child can have some spefic method which we dont know so we need to check instance of everytime so instead of that we can pass
    // interface in constructor and do constructor injection
    public void update();
}
