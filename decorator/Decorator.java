package decorator;


/**
 * 装饰者模式实际上就是对于某一个类进行的无限递归
 */
public class Decorator extends Drink{
    //被装饰者
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }


    @Override
    public float cost() {
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + "&&" +
                super.getDescription() +super.getPrice();
    }
}
