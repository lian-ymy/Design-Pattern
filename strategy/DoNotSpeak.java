package strategy;

public class DoNotSpeak implements SpeakStrategy{
    @Override
    public void speak() {
        System.out.println("不能说话");
    }
}
