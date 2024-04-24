package mediator;

public class Coffee extends Colleague {
    public Coffee(Mediator mediator, String name) {
        super(mediator, name);
        //向中介者中添加电器
        mediator.Register(name,this);
    }

    public void startCoffee() {
        System.out.println("咖啡机开启");
    }

    public void finishCoffee() {
        System.out.println("咖啡机关闭");
    }

    @Override
    public void sendMessage(int stateChange) {
        //中介者接收消息
        getMediator().getMessage(stateChange,this.getName());
    }
}
