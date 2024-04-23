package proxy.activeproxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDao());
        //为目标对象创建代理对象
        //这里应用动态绑定机制，在执行对象中的功能时，会动态绑定到
        //对应实现类上面
        ITeacher proxyInstance = (ITeacher) proxyFactory.getProxyInstance();

        proxyInstance.teach();
        proxyInstance.sayHello("卡芙卡");

        System.out.println(proxyInstance.getClass());
    }
}
