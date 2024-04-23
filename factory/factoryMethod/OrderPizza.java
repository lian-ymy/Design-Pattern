package factory.factoryMethod;

import factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    //定义一个抽象方法，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购的披萨类型
        do {
            orderType = getType();
            //抽象方法，由工厂子类进行实现
            pizza = createPizza(orderType);
            //输出pizza制作过程
            pizza.make();
        } while (true);
    }

    public String getType() {
        String str = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入你要吃的披萨种类");
            str = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
