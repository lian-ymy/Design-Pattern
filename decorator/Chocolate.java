package decorator;

public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("一份巧克力");
        setPrice(2.0f);
    }
}
