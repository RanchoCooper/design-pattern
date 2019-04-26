package chapter04.factory.pizzafm;

/**
 * @author rancho
 * @date 2019-04-26
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
