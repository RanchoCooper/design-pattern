package chapter03.decorator.startbuzz;

/**
 * @author rancho
 * @date 2019-04-06
 */
public class Espresso extends AbstractBeverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
