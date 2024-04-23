package factory;

import factory.Pizza;

public class PepperPizza extends Pizza {
    @Override
    public void make() {
        System.out.println("胡椒披萨制作中！");
    }
}
