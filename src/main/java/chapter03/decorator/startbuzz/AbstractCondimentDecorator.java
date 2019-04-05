package chapter03.decorator.startbuzz;

/**
 * @author rancho
 * @date 2019-04-05
 */
public abstract class AbstractCondimentDecorator extends AbstractBeverage {

    /**
     * get condiment description
     * @return
     */
    @Override
    public abstract String getDescription();
}
