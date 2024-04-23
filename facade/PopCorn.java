package facade;

public class PopCorn {
    private static PopCorn instance = new PopCorn();

    public static PopCorn getInstance() {
        return instance;
    }

    //爆米花设备操作
    public void openPop() {
        System.out.println("爆米花设备开机");
    }

    public void closePop() {
        System.out.println("爆米花设备关机");
    }

    public void pop() {
        System.out.println("取爆米花");
    }
}
