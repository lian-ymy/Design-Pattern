package strategy;

//鸭子的上层抽象接口
public abstract class Duck {
    //分别聚合飞行、说话、跑步的接口
    FlyStrategy flyStrategy;
    SpeakStrategy speakStrategy;
    RunStrategy runStrategy;

    public abstract void show();

    public void run() {
        if(this.runStrategy!=null) {
            runStrategy.run();
        }
    }

    public void speak() {
        if(this.speakStrategy!=null) {
            speakStrategy.speak();
        }
    }

    public void fly() {
        if(this.flyStrategy!=null) {
            flyStrategy.fly();
        }
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setSpeakStrategy(SpeakStrategy speakStrategy) {
        this.speakStrategy = speakStrategy;
    }

    public void setRunStrategy(RunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }
}
