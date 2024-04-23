package proxy.cglibproxy;

/**
 * 目标对象
 * 这里注意：代理的类不能为final
 * 目标对象的方法如果为final/static，那么就就不会被拦截
 * 即不会执行目标对象额外的业务方法
 */
public class TeacherDao {
    public String teach(String name) {
        System.out.println("教"+name+"学习");
        return "hello";
    }

    public final void sayHelloWorld() {
        System.out.println("Hello World");
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
