package chapter03.decorator.startbuzz;

/**
 * @author rancho
 * @date 2019-04-06
 */
public class HouseBlend extends AbstractBeverage {

    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
