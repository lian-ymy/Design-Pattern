package strategy;

public class DoNotRun implements RunStrategy{
    @Override
    public void run() {
        System.out.println("不能跑步");
    }
}
