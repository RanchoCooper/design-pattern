package chapter01.ducks;

/**
 * @author rancho
 * @date 2019-03-23
 */
public abstract class Duck {

    IFlyBehavior flyBehavior;

    IQuackBehavior quackBehavior;

    Duck() {

    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        quackBehavior = qb;
    }
}
