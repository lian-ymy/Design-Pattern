package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    //聚合目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回target的代理对象
    public Object getProxyInstance() {
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //返回代理对象
        return enhancer.create();
    }

    //重写intercept()方法，实现了对于目标对象的方法调用
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理模式开始");
        Object returnVal = method.invoke(target, objects);
        System.out.println("代理模式结束");
        return returnVal;
    }
}
