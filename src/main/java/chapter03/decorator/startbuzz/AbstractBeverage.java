package chapter03.decorator.startbuzz;

import lombok.Data;

/**
 * @author rancho
 * @date 2019-04-05
 */
@Data
public abstract class AbstractBeverage {

    private String description = "unknown beverage";

    /**
     * calculate beverage price
     * @return price
     */
    public abstract double cost();

    public void showInfo() {
        System.out.println(this.getDescription() + " $" + this.cost());
    }

}
