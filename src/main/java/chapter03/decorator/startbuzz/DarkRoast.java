package chapter03.decorator.startbuzz;

/**
 * @author rancho
 * @date 2019-04-06
 */
public class DarkRoast extends AbstractBeverage{

    public DarkRoast() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
