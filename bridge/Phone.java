package bridge;

public abstract class Phone {
    //将手机品牌聚合进来，通过调用不同手机品牌的各种功能完成实现
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }

    public void close() {
        brand.close();
    }
}
