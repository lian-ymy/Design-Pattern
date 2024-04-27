package strategy;

public class BadRun implements RunStrategy{
    @Override
    public void run() {
        System.out.println("跑步不太行");
    }
}
