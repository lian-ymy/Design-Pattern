package mediator;

public class TV extends Colleague{
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void startTV(){
        System.out.println("打开电视机");
    }

    public void finishTV() {
        System.out.println("关闭电视机");
    }

    //向中介者发送消息
    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange,getName());
    }
}
