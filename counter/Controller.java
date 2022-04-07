/**
 * controller
 */
public class Controller implements EventObserver {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void eventHandler(Events e) {
        
        if(e == Events.INCREASE || e == Events.DECREASE){
            this.model.changeCount(e);
        }

        View.mainpane.changeCount(this.model.getCount());
    }
    
}
