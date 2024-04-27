package strategy;

public class ICanRun implements RunStrategy{
    @Override
    public void run() {
        System.out.println("可以跑步");
    }
}
