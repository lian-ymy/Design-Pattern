package state;

public class Client {
    public static void main(String[] args) {
        //开始活动
        RaffleActivity raffleActivity = new RaffleActivity(2);
        //抽奖10次
        for (int i = 0; i < 20; i++) {
            System.out.println("第"+(i+1)+"次抽奖!");
            raffleActivity.deductIntegral();
            raffleActivity.raffle();
        }
    }
}
