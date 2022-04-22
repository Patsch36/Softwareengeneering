package Designpatterns.ObserverPattern;

public class weatherTerminal implements iTerminal {

    private iStation station;

    public weatherTerminal(iStation station){
        this.station = station;
    }

    @Override
    public void eventHandler(Events e) {
        if(e == Events.CHANGED_TEMPERATURE){
            int temp = this.station.getTemperature();
            System.out.print( String.valueOf( temp ) );
        }
    }
    
}
