package decorator;

public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDescription("一份牛奶");
        setPrice(3.0f);
    }
}
