package bridge;

public class SlidePhone extends Phone{
    public SlidePhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("滑盖手机");
        super.open();
    }

    @Override
    public void call() {
        System.out.println("滑盖手机");
        super.call();
    }

    @Override
    public void close() {
        System.out.println("滑盖手机");
        super.close();
    }
}
