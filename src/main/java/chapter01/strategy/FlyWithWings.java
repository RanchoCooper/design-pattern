package chapter01.strategy;

/**
 * @author rancho
 * @date 2019-03-23
 */
public class FlyWithWings implements IFlyBehavior {

    public void fly() {
        System.out.println("fly with wings");
    }
}
