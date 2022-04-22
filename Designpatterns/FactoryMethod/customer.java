package Designpatterns.FactoryMethod;

public class customer {

    private iMachine machine = new drinksMachine();
    private drink drink = machine.getDrink(kindOfDrinks.cola);
}
