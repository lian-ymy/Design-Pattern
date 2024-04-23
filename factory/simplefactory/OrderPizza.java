package factory.simplefactory;

import factory.CheesePizza;
import factory.GreekPizza;
import factory.PepperPizza;
import factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    //普通方法
    public OrderPizza() {
        Pizza pizza = null;
        //订购的披萨类型
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }
            pizza.make();
        } while (true);
    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";//用户输入的披萨类型

        this.simpleFactory = simpleFactory;

        do {
            orderType = this.getType();
            pizza = this.simpleFactory.createPizze(orderType);
            if (pizza != null) {
                //订购成功！
                pizza.make();
            } else {
                System.out.println("订购披萨失败！");
                break;
            }
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
