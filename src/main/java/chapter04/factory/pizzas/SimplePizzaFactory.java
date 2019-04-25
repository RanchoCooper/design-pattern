package chapter04.factory.pizzas;

/**
 * @author rancho
 * @date 2019-04-25
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (PizzaEnum.Cheese.getType().equals(type)) {
            pizza = new CheesePizza();
        } else if (PizzaEnum.Clam.getType().equals(type)) {
            pizza = new ClamPizza();
        } else if (PizzaEnum.Pepperoni.getType().equals(type)) {
            pizza = new PepperoniPizza();
        } else if (PizzaEnum.Veggie.getType().equals(type)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
