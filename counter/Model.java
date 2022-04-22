package counter;

/**
 * model
 */
public class Model implements iModel {

    private int count;

    public Model() {
        this.count = 0;
    }

    public void changeCount(Events e){
        if (e == Events.INCREASE){
            this.count += 1;
        }
        if (e == Events.DECREASE){
            this.count -= 1;
        }
    }

    public int getCount(){
        return this.count;
    }
}