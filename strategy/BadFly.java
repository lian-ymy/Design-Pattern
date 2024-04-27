package strategy;

public class BadFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("飞行不太行");
    }
}
