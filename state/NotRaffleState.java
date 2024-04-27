package state;

//不许抽奖状态（待抽奖状态）
public class NotRaffleState extends State{
    //关联抽奖活动
    private RaffleActivity raffleActivity;

    public NotRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    //扣除积分
    @Override
    public void deductIntegral() {
        System.out.println("扣掉五十分，可以抽奖了！");
        //状态转换==>可抽奖状态
        //这里由于本类中已经创建了，所以无须在进行创建新的对象
        raffleActivity.setState(raffleActivity.getRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("Sorry，扣除积分才可以抽奖，现在不能抽奖");
        return false;
    }

    @Override
    public void offeringPrizes() {
        System.out.println("没参与抽奖，不能给您发放奖品！");
    }
}
