package proxy.staticproxy;

/**
 * 静态代理优缺点：
 * 优点：在不修改目标对象的功能前提下，能通过代理对象对目标功能进行拓展
 * 缺点：因为代理对象和目标对象要实现一样的接口，所以会有很多代理类
 *      一旦接口增加方法，目标对象与代理对象都需要维护
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
