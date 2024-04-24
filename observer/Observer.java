package observer;

//观察者接口->管理不同的用户
public interface Observer {
    //更新天气数据；（温度，气压，湿度）
    public void update(float temperature,float humidity,float pressure);
}
