package observer;

public interface Subject {
    //注册，增加
    public void registerObserver(Observer observer);
    //移出
    public void remove(Observer observer);
    //通知所有的注册的用户
    public void notifyObserver();
}
