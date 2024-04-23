package flyweight;

import java.util.HashMap;

//享元工厂
public class WebSiteFactory {
    //将享元抽象类聚合过来
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    //用户使用时，如果缓冲池没有就创建一个新的
    public WebSite getWebSiteCategory(String type) {
        if(!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    //统计缓冲池的对象数量
    public int getWebSiteCount() {
        return pool.size();
    }
}
