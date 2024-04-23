package facade;

public class LampLight {
    private static LampLight instance = new LampLight();

    public static LampLight getInstance() {
        return instance;
    }

    //管理灯光
    public void openLamp() {
        System.out.println("开灯");
    }

    public void closeLamp() {
        System.out.println("关灯");
    }
}
