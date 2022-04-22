package Designpatterns.ObserverPattern;

public class weatherStation implements iStation{

    private iEventDispatcher eventDispatcher;

    private int temperature;

    public weatherStation(iEventDispatcher eventDispatcher){
        this.eventDispatcher = eventDispatcher;
    }

    public void measureTemperature(){
        int newTemperature = 0;

        if(this.temperature != newTemperature){
            this.eventDispatcher.notifyObserver(Events.CHANGED_TEMPERATURE);
            this.temperature = newTemperature;
        }
    }

    public int getTemperature() {
        return this.temperature;
    }

}
