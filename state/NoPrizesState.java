package state;

public class NoPrizesState extends State{
    private RaffleActivity raffleActivity;

    public NoPrizesState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductIntegral() {
        System.out.println("没奖品了！！！！");
    }

    @Override
    public boolean raffle() {
        System.out.println("没奖品了！！！");
        return false;
    }

    @Override
    public void offeringPrizes() {
        System.out.println("没奖品了！！！！");
    }
}
