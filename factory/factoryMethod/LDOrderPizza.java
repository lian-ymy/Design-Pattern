package factory.factoryMethod;

import factory.CheesePizza;
import factory.GreekPizza;
import factory.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(orderType.equals("greek")) {
            pizza = new GreekPizza();
        }

        return pizza;
    }
}
