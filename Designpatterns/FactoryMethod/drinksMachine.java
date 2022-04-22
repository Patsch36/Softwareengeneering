package Designpatterns.FactoryMethod;

public class drinksMachine implements iMachine {

    @Override
    public drink getDrink(kindOfDrinks kind) {
        switch(kind){
            case cola: return new cola();
            case fanta: return new fanta();
            case water: return new water();
            default: return null;
        }
    }
    
}
