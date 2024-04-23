package singleton;

/**
 * 饿汉式：静态常量
 *
 * 优点：写法简单，在类装载的时候就完成了实例化，避免了线程同步问题
 * 缺点：在类装载的是哦胡就完成了实例化，没有达到Lazy Loading的效果，
 *      如果从未使用过这个类，可能会造成内存浪费
 */
public class Singleton {
    //1、构造器私有化、外部能new
    private Singleton() {

    }

    //2、本类内部创建对象实例
    private static final Singleton instance = new Singleton();

    //3、提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
