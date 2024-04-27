package state;

//状态抽象类
public abstract class State {
    //扣除积分方法
    public abstract void deductIntegral();

    //抽奖
    public abstract boolean raffle();

    //发送奖励
    public abstract void offeringPrizes();
}
