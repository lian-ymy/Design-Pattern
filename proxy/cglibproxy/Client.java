package proxy.cglibproxy;

public class Client {
    public static void main(String[] args) {
        //目标对象
        TeacherDao teacherDao = new TeacherDao();
        //代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        //获取代理对象
        TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();

        String s = proxyInstance.teach("阮梅");
        System.out.println(s);

        //这里我们如果想要调用其中的静态方法或者final的方法
        //将发现掉用不了，因为已经被拦截了
    }
}
