package strategy;

public class WaterDuck extends Duck{
    public WaterDuck() {
        show();
        this.runStrategy = new BadRun();
        this.flyStrategy = new ICanFly();
        this.speakStrategy = new ICanSpeak();
    }

    @Override
    public void show() {
        System.out.println("这是一只水鸭子，能飞，跑的百搭，能嘎嘎叫");
    }
}
