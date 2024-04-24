package mediator;

public abstract class Colleague {
    //中介者
    private Mediator mediator;
    //电器名称
    private String name;

    public Colleague(Mediator mediator,String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    /**
     * 向中介者发送消息
     * @param stateChange
     */
    public abstract void sendMessage(int stateChange);
}
