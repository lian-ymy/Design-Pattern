package state;

//发送奖品状态
public class OfferPrizesState extends State {
    private RaffleActivity raffleActivity;

    public OfferPrizesState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductIntegral() {
        System.out.println("您中奖了，去领奖品吧");
    }

    @Override
    public boolean raffle() {
        System.out.println("你再领奖，别抽奖了");
        return false;
    }

    @Override
    public void offeringPrizes() {
        if(raffleActivity.getCount()>0) {
            System.out.println("请领取你的奖品，卡芙卡的爱的抱抱");
            //跳转到不能抽奖状态
            raffleActivity.setState(raffleActivity.getNotRaffleState());
            raffleActivity.setCount(raffleActivity.count-1);
        }
        else {
            System.out.println("抱歉，您来晚了，奖品没了");
            raffleActivity.setState(raffleActivity.getNoPrizesState());
        }
    }
}
