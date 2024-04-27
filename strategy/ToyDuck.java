package strategy;

public class ToyDuck extends Duck{

    public ToyDuck() {
        show();
        this.runStrategy = new DoNotRun();
        this.speakStrategy = new DoNotSpeak();
        this.flyStrategy = new DoNotFly();
    }

    @Override
    public void show() {
        System.out.println("这时一个玩具鸭，不能飞，不能跑，不能嘎嘎叫");
    }
}
