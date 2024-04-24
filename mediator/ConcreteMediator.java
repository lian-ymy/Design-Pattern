package mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator{
    //存入具体的电器对象
    private HashMap<String,Colleague>colleagueHashMap;

    public ConcreteMediator() {
        this.colleagueHashMap = new HashMap<String,Colleague>();
    }

    //将电器添加到集合中
    @Override
    public void Register(String colleagueName, Colleague colleague) {
        this.colleagueHashMap.put(colleagueName,colleague);
    }

    //接受电器的消息
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if(colleagueHashMap.get(colleagueName) instanceof Alarm) {
            if(stateChange == 100) {
                Coffee coffee = (Coffee) colleagueHashMap.get("Coffee");
                coffee.startCoffee();
                TV tv = (TV) colleagueHashMap.get("TV");
                tv.startTV();
            }
            else if(stateChange==101) {
                Coffee coffee = (Coffee) colleagueHashMap.get("Coffee");
                coffee.finishCoffee();
                TV tv = (TV) colleagueHashMap.get("TV");
                tv.finishTV();
            }
        }
    }
}
