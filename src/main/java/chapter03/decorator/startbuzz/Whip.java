package chapter03.decorator.startbuzz;

/**
 * @author rancho
 * @date 2019-04-06
 */
public class Whip extends AbstractBeverage{

    AbstractBeverage beverage;

    public Whip(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

}
