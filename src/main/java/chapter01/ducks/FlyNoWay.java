package chapter01.ducks;

/**
 * @author rancho
 * @date 2019-03-23
 */
public class FlyNoWay implements IFlyBehavior {

    public void fly() {
        System.out.println("can not fly");
    }
}
