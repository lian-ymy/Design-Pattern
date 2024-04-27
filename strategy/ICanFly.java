package strategy;

public class ICanFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("可以飞行");
    }
}
