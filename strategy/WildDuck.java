package strategy;

public class WildDuck extends Duck{
    //初始化


    public WildDuck() {
        show();
        speakStrategy = new ICanSpeak();
        runStrategy = new ICanRun();
        flyStrategy = new ICanFly();
    }

    @Override
    public void show() {
        System.out.println("这是一只野鸭，能飞，能跑，能嘎嘎叫");
    }
}
