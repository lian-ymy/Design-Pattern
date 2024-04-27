package responsibilitychain;

//学校的请求类别
public class SchoolRequest {
    //请求的类型
    private String type = null;
    //请求的大概金额
    private float price = 0.0f;
    //Id
    private int id = 0;

    //初始化
    public SchoolRequest(String type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
