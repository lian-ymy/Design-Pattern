package bridge;

public class Client {
    public static void main(String[] args) {
        //折叠式华为手机
        Phone phone = new FoldedPhone(new HuaWei());
        phone.open();
        phone.call();
        phone.close();
        //这里如果想对某个手机样式进行修改是可行的，只需要添加一个set方法即可

        //滑盖式Vivo手机
        Phone phone1 = new SlidePhone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
