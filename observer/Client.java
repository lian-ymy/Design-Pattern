package observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Website1 chrome = new Website1();
        Website2 edge = new Website2();

        weatherData.registerObserver(chrome);
        weatherData.registerObserver(edge);

        weatherData.setData(20,20,20);
        weatherData.setData(30,20,10);
    }
}
