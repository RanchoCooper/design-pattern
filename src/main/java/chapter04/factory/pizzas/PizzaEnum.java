package chapter04.factory.pizzas;

/**
 * @author rancho
 * @date 2019-04-25
 */
public enum PizzaEnum {

    // pizza type
    Cheese("cheese"),
    Pepperoni("pepperoni"),
    Clam("clam"),
    Veggie("veggie"),
    ;

    private String type;

    public String getType() {
        return this.type;
    }

    PizzaEnum(String type) {
        this.type = type;
    }
}
