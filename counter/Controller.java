package counter;

/**
 * controller
 */
public class Controller implements iController {
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

        this.view.changeCountView(this.model.getCount());
    }
    
}
