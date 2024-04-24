package observer;

public class Website1 implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    //显示气象数据
    public void display() {
        System.out.println("网站1气象数据");
        System.out.println("温度："+this.temperature);
        System.out.println("湿度："+this.humidity);
        System.out.println("压力："+this.pressure);
    }
}
