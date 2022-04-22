package Designpatterns.ObserverPattern;

public class office {

    public static void main(String[] args) {

        iEventDispatcher eventDisp = new EventDispatcher();

        iStation weatherStation = new weatherStation(eventDisp);

        iTerminal term = new weatherTerminal(weatherStation);
        eventDisp.addEventObserver(term);

    }
    
}
