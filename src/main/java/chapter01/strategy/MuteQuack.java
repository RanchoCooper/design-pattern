package chapter01.strategy;

/**
 * @author rancho
 * @date 2019-03-23
 */
public class MuteQuack implements IQuackBehavior {

    public void quack() {
        System.out.println("<< silence >>");
    }
}
