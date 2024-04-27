package strategy;

public class ICanSpeak implements SpeakStrategy{
    @Override
    public void speak() {
        System.out.println("可以说话");
    }
}
