package chapter03.decorator.startbuzz;

import org.junit.Test;

/**
 * @author rancho
 * @date 2019-04-06
 */
public class EspressoTest {

    @Test
    public void cost() {
        Espresso espresso = new Espresso();
        System.out.println(espresso.cost());
    }

}