/**
 * main
 */

public class Main {

    public static void main(String[] args) {

        EventDispatcher dispatcher = new EventDispatcher();
        View view = new View(dispatcher);

        Model model = new Model();
        dispatcher.addEventObserver(model);

        Controller controller = new Controller(view, model);
        dispatcher.addEventObserver(controller);
    }
}
