package state;

//抽奖活动
public class RaffleActivity {
    //抽奖状态
    State state;
    //奖品数量
    int count=0;

    //初始化奖品数量，不能抽奖
    public RaffleActivity(int count) {
        System.out.println("抽奖活动开始了！！");
        this.state = getNotRaffleState();
        this.count = count;
    }

    //扣除积分
    public void deductIntegral() {
        state.deductIntegral();
    }

    //抽奖
    public void raffle() {
        if(state.raffle()) {
            state.offeringPrizes();
        }
    }

    State notRaffleState = new NotRaffleState(this);
    State raffleState = new RaffleState(this);
    State offerPrizesState = new OfferPrizesState(this);
    State noPrizesState = new NoPrizesState(this);

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNotRaffleState() {
        return notRaffleState;
    }

    public void setNotRaffleState(State notRaffleState) {
        this.notRaffleState = notRaffleState;
    }

    public State getRaffleState() {
        return raffleState;
    }

    public void setRaffleState(State raffleState) {
        this.raffleState = raffleState;
    }

    public State getOfferPrizesState() {
        return offerPrizesState;
    }

    public void setOfferPrizesState(State offerPrizesState) {
        this.offerPrizesState = offerPrizesState;
    }

    public State getNoPrizesState() {
        return noPrizesState;
    }

    public void setNoPrizesState(State noPrizesState) {
        this.noPrizesState = noPrizesState;
    }
}
