package chapter03.decorator.startbuzz;

/**
 * @author rancho
 * @date 2019-04-06
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        AbstractBeverage beverage = new Espresso();
        beverage.showInfo();

        AbstractBeverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1.showInfo();

        AbstractBeverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2.showInfo();
    }
}
