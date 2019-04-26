package chapter04.factory.pizzafm;

import chapter04.factory.pizzas.PizzaEnum;

/**
 * @author rancho
 * @date 2019-04-26
 */
public class NYPizzaStore extends PizzaStore{

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }

}
