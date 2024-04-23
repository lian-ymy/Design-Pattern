package singleton;

/**
 * 懒汉式（线程安全，同步方法）
 *
 * 优点：进行了两次检查，这样可以保证线程安全
 *      这样，实例化代码只需要执行一次，后面再次访问时，可以直接返回
 *
 * 推荐使用
 */
public class Singleton3 {
    private static volatile Singleton3 instance;

    private Singleton3() {

    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐使用
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            //确保只有一个类能够进入将这个类实例化的方法中
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
