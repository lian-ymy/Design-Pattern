package mediator;

public abstract class Mediator {
    /**
     * 添加电器
     * @param colleagueName 电器名称
     * @param colleague 电器
     */
    public abstract void Register(String colleagueName,Colleague colleague);

    /**
     * 接收电器消息
     * @param stateChange 消息类型
     * @param colleagueName 电器名称
     */
    public abstract void getMessage(int stateChange,String colleagueName);
}
