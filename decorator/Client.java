package decorator;


public class Client {
    public static void main(String[] args) {
        //两份巧克力+一份牛奶的美式咖啡
        //1、先点美式咖啡
        Drink longBlackCoffee = new LongBlackCoffee();
        System.out.println("步骤一::"+longBlackCoffee.getDescription());
        System.out.println("本次花费=>"+longBlackCoffee.cost());

        //2、加牛奶
        longBlackCoffee = new Milk(longBlackCoffee);
        System.out.println("步骤二::"+longBlackCoffee.getDescription());
        System.out.println("本次花费=>"+longBlackCoffee.cost());


        //3、加巧克力
        longBlackCoffee = new Chocolate(longBlackCoffee);
        System.out.println("步骤三::"+longBlackCoffee.getDescription());
        System.out.println("本次花费=>"+longBlackCoffee.cost());

        //4、加巧克力
        longBlackCoffee = new Chocolate(longBlackCoffee);
        System.out.println("步骤四::"+longBlackCoffee.getDescription());
        System.out.println("本次花费=>"+longBlackCoffee.cost());

    }
}
