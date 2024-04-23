package factory;

import factory.Pizza;

public class GreekPizza extends Pizza {
    @Override
    public void make() {
        System.out.println("希腊披萨制作中！");
    }
}
