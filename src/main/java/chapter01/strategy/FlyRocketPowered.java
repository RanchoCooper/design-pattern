package chapter01.strategy;

/**
 * @author rancho
 * @date 2019-03-23
 */
public class FlyRocketPowered implements IFlyBehavior {

    public void fly() {
        System.out.println("flying with a rocket");
    }
}
