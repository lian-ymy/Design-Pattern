package factory;

import factory.simplefactory.OrderPizza;
import factory.simplefactory.SimpleFactory;

public class PizzaStore {
    public static void main(String[] args) {

        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
    }
}
