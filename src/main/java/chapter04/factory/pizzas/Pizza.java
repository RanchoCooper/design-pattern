package chapter04.factory.pizzas;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author rancho
 * @date 2019-04-25
 */
@Data
abstract public class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Backing " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("----" + name + " ---- \n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
