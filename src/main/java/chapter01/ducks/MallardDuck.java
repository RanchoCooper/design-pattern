package chapter01.ducks;

/**
 * @author rancho
 * @date 2019-03-23
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
