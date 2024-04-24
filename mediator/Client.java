package mediator;

public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        ConcreteMediator concreteMediator = new ConcreteMediator();
        //具体电器
        Alarm alarm = new Alarm(concreteMediator, "Alarm");
        Coffee coffee = new Coffee(concreteMediator, "Coffee");
        TV tv = new TV(concreteMediator, "TV");

        //开咖啡机，电视
        alarm.setAlarm(100);
        System.out.println("========");
        alarm.setAlarm(101);
    }
}

