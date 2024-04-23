package flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //用户1需要使用公众号
        WebSite webSite = webSiteFactory.getWebSiteCategory("公众号");
        webSite.use(new User("镜流"));

        //用户2也需要使用公众号
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("公众号");
        webSite1.use(new User("黄泉"));

        //用户3需要使用论坛网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("论坛");
        webSite2.use(new User("卡芙卡"));

        //用户4需要使用大数据网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("大数据");
        webSite3.use(new User("黑天鹅"));

        System.out.println("此时实际使用的网站数量为："+webSiteFactory.getWebSiteCount());
    }
}
