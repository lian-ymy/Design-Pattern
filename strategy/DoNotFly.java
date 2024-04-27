package strategy;

public class DoNotFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("不能飞行");
    }
}
