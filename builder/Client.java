package builder;

public class Client {
    public static void main(String[] args) {
        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //指挥者参与
        HouseDirector houseDirector = new HouseDirector(highBuilding);
        houseDirector.toBuild();

        //盖普通房
        CommonBuilder commonBuilder = new CommonBuilder();
        //指挥者参与
        houseDirector.setHouseBuilder(commonBuilder);
        houseDirector.toBuild();
    }
}
