package state;

import java.util.Random;

//抽奖状态
public class RaffleState extends State{
    private RaffleActivity raffleActivity;

    public RaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductIntegral() {
        System.out.println("已经扣除过积分，可以直接参与抽奖");
    }

    @Override
    public boolean raffle() {
        System.out.println("要抽奖啦！");
        Random random = new Random();
        int num=random.nextInt(10);
        if(num==5) {
            //只有10%的中奖机会 ==》 发放奖品状态
            System.out.println("你装大运了，中奖了诶！！！");
            raffleActivity.setState(raffleActivity.getOfferPrizesState());
            return true;
        }
        else {
            System.out.println("太菜了，没中奖");
            //跳转到不能抽奖的状态，可以继续抽奖
            raffleActivity.setState(raffleActivity.getNotRaffleState());
            return false;
        }

    }

    @Override
    public void offeringPrizes() {
        System.out.println("没中奖，不能发奖品");
    }
}
