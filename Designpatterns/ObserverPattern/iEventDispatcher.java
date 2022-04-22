package Designpatterns.ObserverPattern;

public interface iEventDispatcher {
    public void addEventObserver(EventObserver eo);

    public void notifyObserver(Events e);
}
