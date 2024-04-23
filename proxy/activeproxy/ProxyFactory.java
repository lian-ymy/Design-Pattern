package proxy.activeproxy;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //聚合目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /*
    public static Object newProxyInstance(ClassLoader loader,
        Class<?>[] interfaces,InvocationHandler h)
     */
    //动态代理
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 当我们通过代理类的对象调用方法a时，就会自动的调用如下方法invoke()
                     * @param proxy 代理类的对象
                     *
                     * @param method 要调用的方法
                     *
                     * @param args 方法调用时所需要的参数
                     *
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK代理结束");
                        return returnVal;
                    }
                }
        );
    }
}
