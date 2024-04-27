package strategy;

public class Client {
    public static void main(String[] args) {
        Duck duck = new ToyDuck();
        duck.run();
        duck.fly();
        duck.speak();

        System.out.println("修改玩具鸭的属性");
        duck.setSpeakStrategy(new ICanSpeak());
        duck.speak();
    }
}
