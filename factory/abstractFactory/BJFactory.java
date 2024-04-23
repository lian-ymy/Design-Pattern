package factory.abstractFactory;

import factory.CheesePizza;
import factory.GreekPizza;
import factory.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(orderType.equals("greek")) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
