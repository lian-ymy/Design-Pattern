package mediator;

import iterator.College;

public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在中介者中添加电器
        mediator.Register(name,this);
    }

    //设置闹钟，通过中介者完成这一动作
    public void setAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    //向中介者发送消息
    @Override
    public void sendMessage(int stateChange) {
        //中介者接收消息
        getMediator().getMessage(stateChange,this.getName());
    }
}
