package factory;

import factory.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void make() {
        System.out.println("奶酪披萨制作中！");
    }
}
