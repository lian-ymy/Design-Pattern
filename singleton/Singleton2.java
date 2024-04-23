package singleton;

/**
 * 懒汉式（线程安全，同步方法）
 *
 * 优点：解决了线程安全问题
 * 缺点：每次想要获得类的实例的时候，都需要执行getInstance方法，但是实际上
 *      这个方法只需要执行一次，同步效率低
 *
 * 不推荐使用
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton2 getInstance() {
        if(instance==null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
