package facade;

public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    //DVD的操作方法
    public void open()  {
        System.out.println("DVD开机");
    }

    public void close() {
        System.out.println("DVD关机");
    }

    public void pause() {
        System.out.println("DVD暂停");
    }

    public void option() {
        System.out.println("DVD使用操作");
    }
}
