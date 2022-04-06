import java.util.ArrayList;
import java.util.List;

/**
 * EventDispatcher
 */
public class EventDispatcher {

    private static List<EventObserver> myList = new ArrayList<>();

    public void addEventObserver(EventObserver eo){
        myList.add(eo);
    }

    public void notifyObserver(Events e){
        // System.out.println(e); 
        for (EventObserver observer : myList) {
            // System.out.println(observer);
            observer.eventHandler(e);  
        }
    }
    
    
}
